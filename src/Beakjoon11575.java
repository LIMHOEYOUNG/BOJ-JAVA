import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11575 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            String str= br.readLine();
            for(int i=0;i<str.length();i++){
                int check= str.charAt(i)-'A';
                sb.append((char)((a*check +b)%26+'A'));
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
