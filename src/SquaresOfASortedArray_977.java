import java.util.Arrays;

/**
 * @author huangzebin
 * @description 普通排序
 * @createDate: 2021/7/5 12:31
 */
public class SquaresOfASortedArray_977 {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
