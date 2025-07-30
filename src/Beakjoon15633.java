import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon15633 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int sum= 0;

        for(int i=1;i<=n;i++){
            sum+=n%i==0?i:0;
        }

        System.out.println((5*sum -24));
    }
}
/*
1
3
9

13
65
41
 */