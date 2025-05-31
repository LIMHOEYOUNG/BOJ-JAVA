import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14582 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1= new StringTokenizer(br.readLine());
        StringTokenizer st2= new StringTokenizer(br.readLine());

        //int team1[]= new int[10];
        //int team2[]= new int[10];

        int team1= 0;
        int team2= 0;
        boolean check= false;

        for(int i=0;i<9;i++){
            //team1[i]= Integer.parseInt(st1.nextToken());
            //team2[i]= Integer.parseInt(st2.nextToken());

            team1+=Integer.parseInt(st1.nextToken());

            if(team1>team2) check=true;

            team2+=Integer.parseInt(st2.nextToken());
        }

        System.out.println(team1>team2?"No":check?"Yes":"No");
    }
}
