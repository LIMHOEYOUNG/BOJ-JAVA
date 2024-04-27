import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26546 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(br.readLine());

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String str= st.nextToken();
            int i= Integer.parseInt(st.nextToken());
            int j= Integer.parseInt(st.nextToken());

            for(int c=0;c<str.length();c++){
                if(c<i || j<=c) sb.append(str.charAt(c));
                //else sb.append(str.charAt(c));
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
