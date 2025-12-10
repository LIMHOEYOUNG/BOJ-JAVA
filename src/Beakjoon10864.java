import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10864 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] n= new int[Integer.parseInt(st.nextToken())+1];
        int m= Integer.parseInt(st.nextToken());
        StringBuilder sb= new StringBuilder();

        while(m-->0){
            st= new StringTokenizer(br.readLine());
            n[Integer.parseInt(st.nextToken())]+=1;
            n[Integer.parseInt(st.nextToken())]+=1;
        }

        for(int i=1;i<n.length;i++){
            sb.append(n[i]).append("\n");
        }

        System.out.print(sb);
    }
}
