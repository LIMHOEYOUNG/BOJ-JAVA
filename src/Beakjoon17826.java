import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon17826 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int score= Integer.parseInt(br.readLine());
        int cnt= 1;

        while(st.hasMoreTokens()){
            int n= Integer.parseInt(st.nextToken());
            if(n==score) break;
            cnt++;
        }

        if(1<=cnt&&cnt<=5) System.out.println("A+");
        else if(cnt<=15) System.out.println("A0");
        else if(cnt<=30) System.out.println("B+");
        else if(cnt<=35) System.out.println("B0");
        else if(cnt<=45) System.out.println("C+");
        else if(cnt<=48) System.out.println("C0");
        else System.out.println("F");

        //System.out.println(cnt);
    }
}