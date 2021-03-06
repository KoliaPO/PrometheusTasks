package Week7.Tasks;

public class IsDigit {

    public static boolean checkString(String string) {
        if (string == null || string.length() == 0) return false;
        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }
        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9' || c == '.')) {
                return false;
            }
        }
        return true;
    }
}
