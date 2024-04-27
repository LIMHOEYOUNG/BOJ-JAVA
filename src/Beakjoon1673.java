import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1673 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str==null) break;
            StringTokenizer st= new StringTokenizer(str);

            long n= Long.parseLong(st.nextToken());
            long k= Long.parseLong(st.nextToken());

            long answer=n;

            while(n/k!=0){
                answer+=n/k;
                n=n/k+n%k;
            }
            sb.append(answer+"\n");
        }
        System.out.println(sb);
    }
}
