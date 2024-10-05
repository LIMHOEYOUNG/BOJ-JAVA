import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon31280 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int num[]= new int[4];

        for(int i=0;i<4;i++){
            num[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        System.out.println(num[3]+num[2]+num[1]+1);
    }
}
