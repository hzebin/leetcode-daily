import java.util.HashMap;
import java.util.Map;

/**
 * @author huangzebin
 * @description 方法一：暴力循环
 * 方法二：哈希
 * @createDate: 2021/6/9 20:47
 */
public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = new TwoSum_1().twoSum(nums, target);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
