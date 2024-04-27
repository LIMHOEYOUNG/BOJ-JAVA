import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // ascending인지, descending인지, 아니면 mixed

        StringTokenizer st= new StringTokenizer(br.readLine());

        //int check= 1;
        boolean check= true;

        int n= Integer.parseInt(st.nextToken());

        if(n==1){
            for(int i=2;i<=8;i++){
                n= Integer.parseInt(st.nextToken());
                if(n!=i) {
                    check= false;
                    break;
                }
            }

            System.out.println(check?"ascending":"mixed");
        }

        else if(n==8){
            for(int i=7;i>=1;i--){
                n= Integer.parseInt(st.nextToken());
                if(n!=i){
                    check=false;
                    break;
                }
            }

            System.out.println(check?"descending":"mixed");
        }

        else System.out.println("mixed");
    }
}
