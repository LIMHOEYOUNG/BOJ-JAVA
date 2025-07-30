import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4641 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("-1")) break;

            StringTokenizer st = new StringTokenizer(str);
            boolean[] num = new boolean[101];
            int cnt = 0;

            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());
                num[n] = true;

                cnt += num[n] ? num[n * 2] ? 1 : (n % 2 == 0) ? num[n / 2] ? 1 : 0 : 0 : 0;
                if (num[n * 2]) {
                    //System.out.println(n+" => "+(num[n]?num[n*2]?1:(n%2==0)?num[n/2]?1:0:0:0));
                }

                System.out.println("===================\n");
                sb.append(cnt).append("\n");
            }

            System.out.println(sb);
        }
    }
}
