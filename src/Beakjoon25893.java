import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25893 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine();
            StringTokenizer st= new StringTokenizer(str);
            sb.append(str+"\n");

            int cnt= 0;

            while(st.hasMoreTokens()){
                if(Integer.parseInt(st.nextToken())>=10) cnt++;
            }

            if(cnt==0) sb.append("zilch\n\n");
            else if(cnt==1) sb.append("double\n\n");
            else if(cnt==2) sb.append("double-double\n\n");
            else if(cnt==3) sb.append("triple-double\n\n");
        }

        System.out.println(sb);
    }
}
