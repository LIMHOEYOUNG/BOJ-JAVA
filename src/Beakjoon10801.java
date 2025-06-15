import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10801 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer team1= new StringTokenizer(br.readLine());
        StringTokenizer team2= new StringTokenizer(br.readLine());
        int a= 0;
        int b= 0;

        while(team1.hasMoreTokens()){
            int a_score= Integer.parseInt(team1.nextToken());
            int b_score= Integer.parseInt(team2.nextToken());

            if(a_score>b_score) a++;
            else if(a_score<b_score) b++;
        }

        System.out.println(a>b?"A":a==b?"D":"B");
    }
}
