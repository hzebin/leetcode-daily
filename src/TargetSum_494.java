/**
 * @author huangzebin
 * @description 
 * 方法一：递归（回溯）
 * 方法二：
 * @createDate: 2021/6/7 12:52
 */
public class TargetSum_494 {
    
    // 计数
    int count = 0;
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        TargetSum_494 entity = new TargetSum_494();
        int count= entity.findTargetSumWays(nums, target);
        System.out.println(count);
    }

    public int findTargetSumWays(int[] nums, int target) {
        cal(nums, target, 0, 0);
        return count;
    }

    /**
     * 递归函数
     * @param nums 数组
     * @param target 目标值
     * @param index 数组下标
     * @param sum 计算和
     */
    void cal(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                ++count;
            }
        } else {
            cal(nums, target, index + 1, sum + nums[index]);
            cal(nums, target, index + 1, sum - nums[index]);
        }
    } 
}
