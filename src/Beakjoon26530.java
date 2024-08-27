import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        while(n-->0){
            int l= Integer.parseInt(br.readLine());
            double ans=0;
            for(int i=0;i<l;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                String item= st.nextToken();
                int cnt= Integer.parseInt(st.nextToken());
                double cost= Double.parseDouble(st.nextToken());

                ans+=(cnt*cost);
            }

            sb.append("$"+String.format("%.2f",ans)+"\n");
        }

        System.out.println(sb);
    }
}
