public class tp {
    public static String robotWithString(String s) {
        StringBuilder t = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        t.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > t.charAt(t.length() - 1)) {
                ans.append(t.charAt(t.length() - 1));
                t.delete(t.length() - 1, t.length());
                t.append(s.charAt(i));
            } else if (s.charAt(i) == t.charAt(t.length() - 1)) {
                t.append(s.charAt(i));
            } else {
                ans.append(s.charAt(i));
            }
        }
        ans.append(t);
        t = new StringBuilder(s);
        t = t.reverse();
        System.out.println(t.toString() + "         " + ans.toString());
        for (int i = 0; i < s.length(); i++) {
            if (t.charAt(i) > ans.charAt(i)) {
                return t.toString();
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "hrughrhfjrh";
        String ans = robotWithString(s);
        System.out.println(ans);
    }
}