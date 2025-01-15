import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();
        String words= st.nextToken();
        int len= words.length();
        sb.append(words.charAt(0));

        for(int i=0;i<n-1;i++){
            words= st.nextToken();
            int check= words.length();

            sb.append(len>check?" ":words.charAt(len-1));

            len= check;
        }

        System.out.println(sb);
    }
}
