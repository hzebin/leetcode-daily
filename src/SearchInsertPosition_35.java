/**
 * 二分查找
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                ans = middle;
                break;
            }
        }
        if (ans != -1) {
            return ans;
        }
        return left;
    }
}
