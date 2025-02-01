import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6378 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            String n= br.readLine();

            if(n.equals("0")) break;

            while(n.length()>1){
                int ans=0;

                for(int i=0;i<n.length();i++){
                    ans+= n.charAt(i)-'0';
                }

                n= String.valueOf(ans);
            }

            sb.append(n+"\n");
        }

        System.out.println(sb);
    }
}
