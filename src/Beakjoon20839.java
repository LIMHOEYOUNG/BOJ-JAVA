import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int standard_a= Integer.parseInt(st.nextToken());
        int standard_c= Integer.parseInt(st.nextToken());
        int standard_e= Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int e= Integer.parseInt(st.nextToken());

        if(a>=standard_a && c>=standard_c && e>=standard_e) System.out.println("A");
        else if(a>=((standard_a+1)/2) && c>=standard_c && e>=standard_e) System.out.println("B");
        else if(c>=standard_c && e>=standard_e) System.out.println("C");
        else if(c>=((standard_c+1)/2) && e>=standard_e) System.out.println("D");
        else System.out.println("E");
    }
}
