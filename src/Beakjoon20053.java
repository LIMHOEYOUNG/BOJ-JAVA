import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20053 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            int n= Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            int max= Integer.MIN_VALUE;
            int min= Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int num= Integer.parseInt(st.nextToken());
                if(num>max) max=num;
                if(num<min) min=num;
            }

            sb.append(min+" "+max+"\n");
        }

        System.out.print(sb);
    }
}
