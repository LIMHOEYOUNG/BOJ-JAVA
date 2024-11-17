import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            int y= 0;
            int k= 0;

            for(int i=0;i<9;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                y+= Integer.parseInt(st.nextToken());
                k+= Integer.parseInt(st.nextToken());
            }

            sb.append(y>k?"Yonsei\n":y<k?"Korea\n":"Draw\n");
        }

        System.out.println(sb);
    }
}