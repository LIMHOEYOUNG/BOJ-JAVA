import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon21633 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double ans = Double.parseDouble(br.readLine()) * 0.01 + 25;

        if(ans< 100) {
            ans = 100;
        }

        else if(ans> 2000) {
            ans = 2000;
        }


        System.out.print(String.format("%.2f", ans));
    }
}
