import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14910 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        boolean check= false;
        int before_n= Integer.parseInt(st.nextToken());

        while(st.hasMoreTokens()){
            int n= Integer.parseInt(st.nextToken());
            if(before_n>n) {
                check= true;
                break;
            }

            before_n= n;
        }

        System.out.println(check?"Bad":"Good");
    }
}
