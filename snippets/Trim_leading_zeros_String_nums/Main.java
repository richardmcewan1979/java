Trim leading zeros

public static String trimLeadingZeros(String source) {
    for (int i = 0; i < source.length(); ++i) {
        char c = source.charAt(i);
        if (c != '0') {
            return source.substring(i);
        }
    }
    return ""; // or return "0";
}
