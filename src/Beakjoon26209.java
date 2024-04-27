import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26209 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        boolean flag= false;
        while(st.hasMoreTokens()){
            int check= Integer.parseInt(st.nextToken());
            if(check!=0 && check!=1) {
                flag=true;
                break;
            }
        }
        System.out.println(flag?"F":"S");
    }
}
