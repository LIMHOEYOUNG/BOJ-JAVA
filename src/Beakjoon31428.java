import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon31428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());
        int ans= 0;
        String helloBit= br.readLine();

        while(st.hasMoreTokens()){
            String course= st.nextToken();
            if(course.equals(helloBit)) ans++;
        }

        System.out.println(ans);
    }
}
