import java.util.HashSet;
import java.util.Set;

/**
 * @author huangzebin
 * @description https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @createDate: 2021/5/24 17:28
 */
public class lengthOfLongestSubstring_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int len = s.length();
        int right = -1;
        int ans = 0;
        Set set = new HashSet<Character>();
        for (int i = 0; i < len; ++i) {
            while ((right + 2) <= len) {
                char c = s.charAt(right + 1);
                if (set.contains(c)) {
                    break;
                } else {
                    ++right;
                    set.add(c);
                    ans = Math.max(ans, right - i + 1);
                }
            }
            set.remove(s.charAt(i));
        }
        System.out.println(ans);
    }
}
