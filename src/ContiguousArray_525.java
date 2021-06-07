import java.util.HashMap;
import java.util.Map;

/**
 * @author huangzebin
 * @description https://leetcode-cn.com/problems/contiguous-array/
 * 数组前缀和 + HashMap
 * @createDate: 2021/6/3 15:14
 */
public class ContiguousArray_525 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0};
        
        int count = 0;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            int num = nums[i];
            if (num == 0) {
                --count;
            } else {
                ++count;
            }
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        System.out.println(maxLength);
    }
}
