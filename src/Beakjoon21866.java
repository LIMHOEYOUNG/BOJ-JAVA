import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon21866 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int total_score= 0;
        int cnt= 0;

        while(st.hasMoreTokens()){
            int score= Integer.parseInt(st.nextToken());

            if(score>(100*(cnt/2 +1))) {
                System.out.println("hacker");
                return;
            }

            total_score+= score;
            cnt++;
        }

        System.out.println(total_score>=100?"draw":"none");
    }
}
