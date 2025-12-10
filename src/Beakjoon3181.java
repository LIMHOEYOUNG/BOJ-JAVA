import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3181 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String[] word= {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();
        sb.append(st.nextToken().substring(0,1).toUpperCase());

        while(st.hasMoreTokens()){
            String w= st.nextToken();
            boolean flag= false;
            for(int i=0;i<word.length;i++){
                if(w.equals(word[i])){
                    flag= true;
                    break;
                }
            }

            sb.append(flag?"":(w.substring(0,1).toUpperCase()));
        }

        System.out.println(sb);
    }
}
