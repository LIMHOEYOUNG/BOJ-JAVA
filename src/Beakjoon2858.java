import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2858 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int r= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        for(int i=b;i>=1;i--){
            if(b%i==0 && (i*2 + (b/i)*2 + 4)==r){
                System.out.println((i+2)+" "+(b/i+2));
                break;
            }
        }
    }
}
