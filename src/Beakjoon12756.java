import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon12756 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int p_a_a= Integer.parseInt(st.nextToken());
        int p_a_h= Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int p_b_a= Integer.parseInt(st.nextToken());
        int p_b_h= Integer.parseInt(st.nextToken());

        while(true){
            p_b_h-=p_a_a;
            p_a_h-=p_b_a;
            if(p_a_h<=0 || p_b_h<=0) break;
        }

        System.out.println((p_a_h<=0 && p_b_h<=0)?"DRAW":p_a_h>p_b_h?"PLAYER A":"PLAYER B");
    }
}
