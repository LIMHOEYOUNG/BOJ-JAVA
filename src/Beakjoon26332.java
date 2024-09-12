import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26332 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine();
            sb.append(str+"\n");
            StringTokenizer st= new StringTokenizer(str);

            int c= Integer.parseInt(st.nextToken());
            int p= Integer.parseInt(st.nextToken());

            sb.append((p+((c-1)*(p-2)))+"\n");
        }

        System.out.println(sb);
    }
}
