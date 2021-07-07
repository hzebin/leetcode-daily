/**
 * 二分查找（注意数据范围）
 */
public class FirstBadVersion_278 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        if (isBadVersion(left)) {
            return left;
        } else if (isBadVersion(left + 1)) {
            return left + 1;
        } else {
            return left + 2;
        }
    }

    boolean isBadVersion(int version){
        //TODO
        return false;
    }
}
