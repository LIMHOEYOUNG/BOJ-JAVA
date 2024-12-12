import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());

        System.out.println(((Math.min(k,n))+1)+" "+((k*n)+1));
    }
}
