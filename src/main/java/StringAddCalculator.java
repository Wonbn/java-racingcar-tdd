import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    static String[] numbers;

    public static int splitAndSum(String in) {
        if(isNull(in)) {
            return 0;
        }

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(in);
        if(m.find()) {
            String customDelimiter = m.group(1);
            numbers = m.group(2).split(customDelimiter);
            return sumNumbers(numbers);
        }

        numbers = splitString(in, ":|,");
        return sumNumbers(numbers);
    }

    private static String[] splitString(String in, String separator) {
        return in.split(separator);
    }

    private static int sumNumbers(String[] numbers) {
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += stoi(numbers[i]);
        }

        return sum;
    }

    private static boolean isNull(String in) {
        if(in == null || in.isEmpty()) {
            return true;
        }
        return false;
    }

    private static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
    }
}
