import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1834 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        long answer =0;
        for(long i=1;i<n;i++){
            // n=1 : X
            // n=2 : 3
            // n=3 : 4, 8
            // n=4 : 5, 10, 15
            // n=5 : 6, 12, 18, 24
            answer+=i*(n+1);
        }
        System.out.println(answer);
    }
}

