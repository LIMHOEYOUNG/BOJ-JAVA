import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1453 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        boolean check[]= new boolean[101];

        int n= Integer.parseInt(br.readLine());

        int answer=0;
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int seat= Integer.parseInt(st.nextToken());
            if(check[seat]) answer++;
            else check[seat]= true;
        }

        System.out.println(answer);
    }
}
