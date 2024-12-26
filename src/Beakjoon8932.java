import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon8932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        double a[] = {9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193};
        double b[] = {26.7, 75, 1.5, 42.5, 210, 3.8, 254};
        double c[] = {1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88};

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int result = 0;

            for (int i = 0; i < a.length; i++) {
                int p = Integer.parseInt(st.nextToken());

                if(i==0||i==3||i==6) {
                    result += (int)(a[i] * (Math.pow(b[i]-p, c[i])));
                }
                else{
                    result += (int)(a[i] * (Math.pow(p-b[i], c[i])));

                }

            }

            sb.append(result+"\n");
        }

        System.out.println(sb);
    }
}
