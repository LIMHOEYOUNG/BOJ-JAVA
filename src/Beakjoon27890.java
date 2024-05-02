import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon27890 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int x= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());

        while (n-->0){
            if(x%2==0){
                x=(x/2)^6;
            }
            else{
                x=(x*2)^6;
            }
        }

        System.out.println(x);
    }
}
