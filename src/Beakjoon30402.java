import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<15;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String check= st.nextToken();
                if(check.equals("w")){
                    System.out.println("chunbae");
                    return;
                }
                else if(check.equals("b")){
                    System.out.println("nabi");
                    return;
                }
                else if(check.equals("g")){
                    System.out.println("yeongcheol");
                    return;
                }
            }
        }
    }
}
