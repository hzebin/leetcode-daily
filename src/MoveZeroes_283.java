/**
 * @author huangzebin
 * @description 普通逻辑
 * @createDate: 2021/7/5 17:09
 */
public class MoveZeroes_283 {
    public static void main(String[] args) {
        MoveZeroes_283 entity = new MoveZeroes_283();
        int[] array = {1};
        entity.moveZeroes(array);
    }
    public void moveZeroes(int[] nums) {
        int index = 0;
        int cur = index;
        int len = nums.length;
        while (cur < len) {
            if (nums[cur] != 0) {
                nums[index++] = nums[cur++];
            } else {
                ++cur;
            }
        }
        for (int i = index; i < len; ++i) {
            nums[i] = 0;
        }
        return;
    }
}
