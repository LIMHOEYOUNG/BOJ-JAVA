import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

public class Beakjoon20374 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        BigDecimal total = BigDecimal.ZERO;

        String str="";

        while((str=br.readLine())!=null) {
            BigDecimal expense = new BigDecimal(str);
            total = total.add(expense);
        }

        total = total.setScale(2, RoundingMode.HALF_UP);

        System.out.printf("%.2f\n", total);

    }
}
/*
5
1432.23
216.09
1475.09
1327.40
2457.19
 */