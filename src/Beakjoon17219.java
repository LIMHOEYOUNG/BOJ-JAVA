import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Beakjoon17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();

        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        Map<String,String> set= new HashMap<String,String>();

        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            set.put(st.nextToken(),st.nextToken());
        }

        for(int i=0;i<m;i++){
            String str= br.readLine();
            sb.append(set.get(str)+"\n");
        }

        System.out.println(sb);
    }
}
