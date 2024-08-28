import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30794 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        String stat= st.nextToken();

        switch (stat){
            case("miss"):
                System.out.println(0);
                break;
            case("bad"):
                System.out.println(200*n);
                break;
            case("cool"):
                System.out.println(400*n);
                break;
            case("great"):
                System.out.println(600*n);
                break;
            case("perfect"):
                System.out.println(1000*n);
                break;
        }
    }
}
