import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon28960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int h= Integer.parseInt(st.nextToken());
        int l= Integer.parseInt(st.nextToken());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        if((l>=a && b<=2*h)||(l>=b && a<=2*h)){
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
