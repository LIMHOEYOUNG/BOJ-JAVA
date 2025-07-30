import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2386 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            /*
            StringTokenizer st= new StringTokenizer(br.readLine());
            char f= st.nextToken().charAt(0);

            if(f=='#') break;

            int cnt= 0;

            while(st.hasMoreTokens()){
                String str= st.nextToken();

                for(int i=0;i<str.length();i++){
                    if(f== Character.toLowerCase(str.charAt(i))) cnt++;
                }

            }
            */
            String str= br.readLine();
            char f= str.charAt(0);
            if(f=='#') break;

            int cnt= 0;
            for(int i=1;i<str.length();i++){
                if(f== Character.toLowerCase(str.charAt(i))) cnt++;
            }

            sb.append(f).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
