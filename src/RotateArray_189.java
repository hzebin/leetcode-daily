/**
 * @author huangzebin
 * @description 数组逻辑思考
 * @createDate: 2021/7/5 13:03
 */
public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; ++i) {
            res[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; ++i) {
            nums[i] = res[i];
        }
    }
}
