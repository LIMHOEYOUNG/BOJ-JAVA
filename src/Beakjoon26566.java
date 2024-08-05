import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a1= Integer.parseInt(st.nextToken());
            int p1= Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            int r1= Integer.parseInt(st.nextToken());
            int p2= Integer.parseInt(st.nextToken());

            sb.append(((a1/p1)<((Math.PI*Math.pow(r1,2))/p2))?"Whole pizza\n":"Slice of pizza\n");
        }

        System.out.println(sb);
    }
}
