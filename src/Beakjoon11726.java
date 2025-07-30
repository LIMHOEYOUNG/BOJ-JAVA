import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11726 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        long[] tile= new long[n+1];
        tile[0]= 1;
        tile[1]= 1;

        //피보나치
        for(int i=2;i<=n;i++){
            tile[i]= tile[i-1]+tile[i-2];
        }

        System.out.println(tile[n]%10007);
    }
}
