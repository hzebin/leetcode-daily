import java.util.HashSet;
import java.util.Set;

/**
 * @author huangzebin
 * @description
 * @createDate: 2021/7/7 12:38
 */
public class CountGoodMeals_1711 {
    public int countPairs(int[] deliciousness) {
        Set<Integer> set = new HashSet<>();
        int temp = 1;
        for (int i = 1; i <=20; ++i) {
            temp *= 2;
            set.add(temp);
        }

        int ans = 0;
        int d = (int)Math.pow(10, 9) + 7;
        int len = deliciousness.length;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (set.contains(deliciousness[i] + deliciousness[j])) {
                    ans = (++ans) % d;
                }
            }
        }

        return ans;
    }
}
