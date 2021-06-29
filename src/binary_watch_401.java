import java.util.ArrayList;
import java.util.List;

/**
 * @author huangzebin
 * @description 暴力破解
 * @createDate: 2021/6/21 11:52
 */
public class binary_watch_401 {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 11; ++i) {
            for (int j = 0; j <= 59; ++j) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    result.add(i + ":" + (j < 10 ? "0" + j : j));
                }
            }
        }
        return result;
    }
    
}
