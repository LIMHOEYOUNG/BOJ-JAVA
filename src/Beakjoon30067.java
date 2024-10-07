import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon30067 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int check= 0;

        for(int i=0;i<10;i++){
            check+=Integer.parseInt(br.readLine());
        }

        System.out.println(check/2);
    }
}
