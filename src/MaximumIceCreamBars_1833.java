import java.util.Arrays;

/**
 * @author huangzebin
 * @description 普通排序
 * @createDate: 2021/7/2 8:40
 */
public class MaximumIceCreamBars_1833 {

    public static void main(String[] args) {
        MaximumIceCreamBars_1833 entity = new MaximumIceCreamBars_1833();
        int[] costs = {1, 3, 2, 4, 1};
        System.out.println(entity.maxIceCream(costs, 7));
    }

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        for (int i = 0; i < costs.length; i++) {
            if (coins - costs[i] < 0) {
                break;
            }
            coins -= costs[i];
            ++res;
        }
        return res;
    }
    
}
