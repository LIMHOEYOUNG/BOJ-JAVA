import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon11034 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        String str;

        while((str= br.readLine())!=null){
            StringTokenizer st= new StringTokenizer(str);
            if(!st.hasMoreTokens()) break;

            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());

            sb.append(Math.max(c-b,b-a)-1).append("\n");
        }

        System.out.println(sb);
    }
}
