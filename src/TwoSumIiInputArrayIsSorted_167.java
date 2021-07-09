import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author huangzebin
 * @description
 * @createDate: 2021/7/5 17:38
 */
public class TwoSumIiInputArrayIsSorted_167 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i + 1);
        }
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                ans[0] = i + 1;
                ans[1] = map.get(target - numbers[i]);
                break;
            }
        }
        return ans;
    }
}
