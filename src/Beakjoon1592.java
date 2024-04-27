import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1592 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int l= Integer.parseInt(st.nextToken());

        int[] person = new int[n];
        int cnt= 0, answer= 0;

        person[0] = 1;
        while(person[cnt] != m) {
            cnt += person[cnt] % 2 == 0 ? l : -l;

            if(cnt >= n) {
                cnt -= n;
            }
            if(cnt < 0) {
                cnt += n;
            }
            person[cnt]++;
            answer++;
        }
        System.out.print(answer);
    }
}
