import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon17263 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        long max= Long.MIN_VALUE;

        for(int i=0;i<n;i++){
            long num= Long.parseLong(st.nextToken());

            max= Math.max(num,max);
        }

        System.out.println(max);
    }
}
