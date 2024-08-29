import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int cost= Integer.parseInt(st.nextToken());
        int additionalCost= Integer.parseInt(st.nextToken());

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        while(n-->0){
            int wattage= Integer.parseInt(br.readLine());
            int normalWatage=wattage>1000?1000:wattage;
            int additionalWattage= wattage>1000?(wattage-1000):0;
            //sb.append(wattage+" "+((cost*((wattage/1000)*1000))+(additionalCost*(wattage%1000)))+"\n");
            sb.append(wattage+" "+((normalWatage*cost)+(additionalWattage*additionalCost))+"\n");
        }

        System.out.println(sb);
    }
}
