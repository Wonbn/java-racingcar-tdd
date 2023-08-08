public class StringAddCalculator {
    static int sum = 0;

    public static int splitAndSum(String in) {
        if(isNull(in)) {
            return 0;
        }

        splitString(in,",");

        return sum;
    }

    private static void splitString(String in,String separator) {
        String[] tmpNumbers = in.split(separator);

        for(int i = 0; i < tmpNumbers.length; i++) {
            if(tmpNumbers[i].length() != 1) {
                splitString(tmpNumbers[i], ":");
            }
            if(tmpNumbers[i].length() == 1) {
                sum += stoi(tmpNumbers[i]);
            }
        }
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
