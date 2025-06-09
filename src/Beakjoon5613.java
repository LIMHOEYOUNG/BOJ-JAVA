import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5613 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long ans= Long.parseLong(br.readLine());


        while(true){
            String str= br.readLine();

            if(str.equals("+")){
                ans+=Long.parseLong(br.readLine());
            }
            else if(str.equals("-")){
                ans-=Long.parseLong(br.readLine());
            }
            else if(str.equals("/")){
                ans/=Long.parseLong(br.readLine());
            }
            else if(str.equals("*")){
                ans*=Long.parseLong(br.readLine());
            }
            else if(str.equals("=")){
                break;
            }
        }

        System.out.println(ans);
    }
}
