import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20336 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        while(n-->0){
            if(n==0){
                StringTokenizer st= new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                }
                break;
            }
            br.readLine();
        }
    }
}
