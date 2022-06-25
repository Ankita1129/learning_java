import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class Putting_Plates {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        loop: while (tc > 0) {
            tc = tc - 1;
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h < 5) {
                for (int i = 0; i < h; i++) {
                    if ((i == 0) || (i == (h - 1))) {
                        for (int j = 0; j < w; j++) {
                            if (j % 2 == 0) {
                                pw.print(1);
                            } else {
                                pw.print(0);
                            }
                        }
                        pw.println();
                    } else {
                        for (int j = 0; j < w; j++) {
                            pw.print(0);
                        }
                        pw.println();
                    }
                }
                continue loop;
            }

            l: for (int i = 0; i < h; i++) {
                if (i == (h - 2)) {
                    for (int j = 0; j < w; j++) {
                        pw.print(0);
                    }
                    pw.println();
                    continue l;
                }
                if ((i == 0) || (i == (h - 1))) {
                    for (int j = 0; j < w; j++) {
                        if (j % 2 == 0) {
                            pw.print(1);
                        } else {
                            pw.print(0);
                        }
                    }
                    pw.println();
                } else {
                    if (i % 2 == 0) {
                        for (int j = 0; j < w; j++) {
                            if ((j == 0) || (j == (w - 1))) {
                                pw.print(1);
                            } else {
                                pw.print(0);
                            }
                        }
                        pw.println();
                    } else {
                        for (int j = 0; j < w; j++) {
                            pw.print(0);
                        }
                        pw.println();
                    }
                }
            }
            pw.println();
            pw.println();
        }
        pw.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
