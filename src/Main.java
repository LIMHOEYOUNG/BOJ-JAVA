import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= 1000-Integer.parseInt(br.readLine());
        int ans= 0;

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
/*
501

990
500 -> 1
100 -> 4
50 -> 1
10 -> 4
5 -> 1550
1 -> 4
 */