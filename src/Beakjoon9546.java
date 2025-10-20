import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon9546 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        long person[]= new long[31];
        person[1]= 1;
        int record_last_station= 1;

        while(t-->0){
            int n= Integer.parseInt(br.readLine());
            if(person[n]!=0) {
                sb.append(person[n]).append("\n");
                continue;
            }

            //f(n+1)= 2*f(n)+1
            for(int i=record_last_station;i<n;i++){
                person[i+1]= 2*person[i]+1;
            }

            record_last_station= n;
            sb.append(person[n]).append("\n");
        }

        System.out.print(sb);
    }
}
