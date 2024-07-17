import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int s= Integer.parseInt(st.nextToken());
        int d= Integer.parseInt(st.nextToken());
        int i= Integer.parseInt(st.nextToken());
        int l= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());

        int check=n*4-(s+d+i+l);

        if((s+d+i+l)>=n*4){
            check=0;
        }
        System.out.println(check);

    }
}
