import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        boolean check= false;

        for(int i=0;i<=30;i++){
            if(n==Math.pow(2,i)) {
                check=!check;
                break;
            }
        }

        System.out.println(check?"1":"0");
    }
}
