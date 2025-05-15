import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon14920 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        System.out.println(calc(n,0));

    }

    public static int calc(int n, int ans){
        if(n==1) {
            //System.out.println("ans = "+ans);
            return ans+1;
        }
        if(n%2==0) {
            //System.out.println(n/2);
            return calc(n/2,ans+1);
        }
        else {
            //System.out.println(3*n+1);
            return calc(3*n+1,ans+1);
        }
    }
}
