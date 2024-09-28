import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            String str= br.readLine();;
            int a= 0;
            int b= 0;
            for(int i=0;i<str.length();i++){
                char c= str.charAt(i);
                if(c=='a') a++;
                else if(c=='b') b++;
            }

            sb.append(Math.min(a,b)+"\n");
        }

        System.out.println(sb);
    }
}
