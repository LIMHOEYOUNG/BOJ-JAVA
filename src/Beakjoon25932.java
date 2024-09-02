import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Beakjoon25932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine();
            StringTokenizer st= new StringTokenizer(str);
            boolean zack= false;
            boolean mack= false;

            while(st.hasMoreTokens()){
                int num= Integer.parseInt(st.nextToken());
                if(num==17) zack= true;
                else if(num==18) mack= true;
            }

            sb.append(str+"\n").append((zack?(mack?"both\n":"zack\n"):mack?"mack\n":"none\n")+"\n");
        }

        System.out.println(sb);
    }
}
