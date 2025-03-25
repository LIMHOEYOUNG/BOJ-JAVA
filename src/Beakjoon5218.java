import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5218 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            String str1= st.nextToken();
            String str2= st.nextToken();

            sb.append("Distances: ");
            for (int i = 0; i < str1.length(); i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);

                sb.append(((c2-c1)<0?((c2+26)-c1):(c2-c1))+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
