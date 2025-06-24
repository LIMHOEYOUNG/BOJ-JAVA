import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Beakjoon2052 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        System.out.printf("%."+n+"f",(BigDecimal.valueOf(0.5).pow(n)));
    }
}
