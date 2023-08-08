public class StringAddCalculator {
    public static int splitAndSum(String in) {
        int sum = 0;
        String[] strArr;

        if(isNull(in)) {
            return 0;
        }

        strArr = in.split("");
        sum = stoi(strArr[0]);

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
}
