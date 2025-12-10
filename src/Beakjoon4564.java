import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4564 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= "";
        StringBuilder sb= new StringBuilder();

        while(!((str=br.readLine()).equals("0"))){
            while(str.length()!=1){
                int ans= 1;
                int s_len= str.length();
                sb.append(str).append(" ");

                for(int i=0;i<s_len;i++){
                    ans*= (str.charAt(i)-'0');
                }

                str= Integer.toString(ans);
            }

            sb.append(str).append("\n");
        }

        System.out.print(sb);
    }
}
