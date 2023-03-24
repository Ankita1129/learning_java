public class DecodeString {
    public static String decodeString(String s) {
        return fxn(s, 0);
    }

    public static String fxn(String s, int idx) {
        if (idx >= s.length()) {
            return "";
        }
        String left = "";
        while (idx < s.length() && s.charAt(idx) >= 'a' && s.charAt(idx) <= 'z') {
            left += s.charAt(idx);
            idx++;
        }

        String str = "";
        int num = 0, pow = 1, val = 0;
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            val = (int) (s.charAt(idx) - '0');
            num *= pow;
            pow *= 10;
            num += val;
            idx++;
        }
        str = "";
        idx++;
        while (idx < s.length() && s.charAt(idx) != ']') {
            str += s.charAt(idx);
            idx++;
        }
        String rs = fxn(s, idx + 1);
        String ans = "";
        ans += left + "";
        for (int i = 0; i < num; i++) {
            ans += str + "";
        }
        ans += rs + "";
        return ans;
    }

    public static void main(String[] args) {
        String s = decodeString("2[abc]3[cd]ef");
        System.out.println(s);
    }
}
