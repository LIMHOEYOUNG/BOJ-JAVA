import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon31281 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        long num[]= new long[3];

        for(int i=0;i<3;i++){
            num[i]= Long.parseLong(st.nextToken());
        }
        Arrays.sort(num);

        System.out.println(num[1]);
    }
}