import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30802 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        StringTokenizer st2= new StringTokenizer(br.readLine());
        int t= Integer.parseInt(st2.nextToken());
        int p= Integer.parseInt(st2.nextToken());

        int tAns= 0;
        while(st.hasMoreTokens()){
            int check= Integer.parseInt(st.nextToken());
            tAns+=((check/t)+(check%t!=0?1:0));
        }

        System.out.println(tAns);
        System.out.println((n/p)+" "+(n%p));
    }
}
