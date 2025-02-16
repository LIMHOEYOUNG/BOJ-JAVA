import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5585 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= 1000-Integer.parseInt(br.readLine());
        int ans= 0;

        /*
        int coins[]= {500,100,50,10,5,1};
        for(int i=0;i<coins.length;i++){ans+=(n/coins[i]); n%=coins[i];}
         */
        if(n/500!=0){
            ans+=(n/500);
            n%=500;
        }
        if(n/100!=0){
            ans+=(n/100);
            n%=100;
        }
        if(n/50!=0){
            ans+=(n/50);
            n%=50;
        }
        if(n/10!=0){
            ans+=(n/10);
            n%=10;
        }
        if(n/5!=0){
            ans+=(n/5);
            n%=5;
        }
        if(n/1!=0){
            ans+=(n/1);
        }

        System.out.print(ans);
    }
}