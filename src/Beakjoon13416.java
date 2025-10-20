import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon13416 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            int n= Integer.parseInt(br.readLine());
            int extracted_cost= 0;

            for(int i=0;i<n;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                int max_cost= 0;

                while(st.hasMoreTokens()){
                    max_cost= Math.max(max_cost,Integer.parseInt(st.nextToken()));
                }
                extracted_cost+=max_cost;
            }
            sb.append(extracted_cost).append("\n");
        }

        System.out.print(sb);
    }
}
