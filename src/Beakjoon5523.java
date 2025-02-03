import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5523 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int a=0, b=0;
        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int scoreA= Integer.parseInt(st.nextToken());
            int scoreB= Integer.parseInt(st.nextToken());

            if(scoreA>scoreB) a++;
            else if(scoreA<scoreB) b++;
        }

        System.out.println(a+" "+b);
    }
}
