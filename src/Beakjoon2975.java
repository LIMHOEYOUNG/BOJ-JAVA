import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int a= Integer.parseInt(st.nextToken());
            String action= st.nextToken();
            int b= Integer.parseInt(st.nextToken());

            //System.out.println(a+" "+action+" "+b);
            if(a==0 && action.equals("W") && b==0) break;


            if(action.equals("D")) sb.append((a+b)+"\n");
            else{
                if((a-b)<-200) sb.append("Not allowed\n");
                else sb.append((a-b)+"\n");
            }


        }

        System.out.println(sb);
    }
}
