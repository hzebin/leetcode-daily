/**
 * @author huangzebin
 * @description
 * @createDate: 2021/6/29 12:33
 */
public class ExcelSheetColumnTitle_168 {

    public static void main(String[] args) {
        ExcelSheetColumnTitle_168 entity = new ExcelSheetColumnTitle_168();
        String s = entity.convertToTitle(2147483647);
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            --columnNumber;
            char c = (char)(columnNumber % 26 + 'A');
            res.append(c);
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }
}
