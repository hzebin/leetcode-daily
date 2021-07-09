import java.util.HashMap;
import java.util.Map;

/**
 * @author huangzebin
 * @description HashMap
 * @createDate: 2021/7/9 14:45
 */
public class FindMajorityElementLcci {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        int max = -1;
        int ans = -1;
        for (int i = 0; i < len; ++i) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > max) {
                max = map.get(nums[i]);
                ans = nums[i];
            }
        }
        int mid = len / 2;
        if (mid < max) {
            return ans;
        } else {
            return -1;
        }
    }
}
