import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14913 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int d= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        double n= ((double)k-(double)a)/(double)d +1;

        System.out.println(n%1!=0 || n<1.0?"X":(long)n);
    }

}
