/**
 * @author huangzebin
 * @description 快速幂 （注意位移经度问题）
 * 题目解析 https://leetcode-cn.com/problems/powx-n/solution/50-powx-n-kuai-su-mi-qing-xi-tu-jie-by-jyd/
 * @createDate: 2021/7/2 9:34
 */
public class PowxN_50 {
    public static void main(String[] args) {
        PowxN_50 entity = new PowxN_50();
        System.out.println(entity.myPow(2.00000, -2147483648));
        System.out.println(entity.myPow(2.000, 10));
        System.out.println(entity.myPow(2.100, 3));
        System.out.println(entity.myPow(2.000, -2));
    }
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0D;
        }
        double ans = 1D;
        long nn = n;
        if (nn < 0) {
            nn = -nn;
            x = 1 / x;
        }
        while (nn > 0) {
            if (((nn & 1) == 1)) {
                ans *= x;
            }
            x *= x;
            nn >>= 1;
        }
        return ans;
    }
}
