import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon12605 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=1;i<=n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String str= "";

            while(st.hasMoreTokens()){
                str= " "+st.nextToken()+str;
            }

            sb.append("Case #"+i+":"+str+"\n");
        }

        System.out.println(sb);
    }
}
