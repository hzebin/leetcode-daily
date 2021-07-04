import java.util.Arrays;

/**
 * 普通排序
 */
public class SetMismatch_645 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int len = nums.length;
        int target = 1;
        for (int i = 0; i < len - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                ans[0] = nums[i];
            }
            if(target == nums[i]) {
                ++target;
            }
        }
        if(target == nums[len - 1]) {
            ++target;
        }
        ans[1] = target;
        return ans;
    }
}
