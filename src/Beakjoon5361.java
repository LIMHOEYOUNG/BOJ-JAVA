import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            double result= (350.34*Double.parseDouble(st.nextToken())) +
                    (230.90*Double.parseDouble(st.nextToken()))+
                    (190.55*Double.parseDouble(st.nextToken()))+
                    (125.30*Double.parseDouble(st.nextToken()))+
                    (180.90*Double.parseDouble(st.nextToken()));

            sb.append("$"+String.format("%.2f\n",result));
        }

        System.out.println(sb);
    }
}
