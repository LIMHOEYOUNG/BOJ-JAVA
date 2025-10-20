import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon33612 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int mo= 1;
        int n= Integer.parseInt(br.readLine());

        System.out.println((2024+(7*n+mo)/13)+" "+((7*n+mo)%12==0?12:(mo+7*n%12)));
    }
}