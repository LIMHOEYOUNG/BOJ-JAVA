import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30319 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine(),"-");

        int yy= Integer.parseInt(st.nextToken());
        int mm= Integer.parseInt(st.nextToken());
        int dd= Integer.parseInt(st.nextToken());

        if(mm<9 || (mm==9 && dd<=16)){
            System.out.println("GOOD");
        }
        else{
            System.out.println("TOO LATE");
        }
    }
}
