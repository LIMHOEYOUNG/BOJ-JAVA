import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11549 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int answer=0;
        while(st.hasMoreTokens()){
            int check= Integer.parseInt(st.nextToken());
            if(check==t) answer++;
        }

        System.out.println(answer);
    }
}
