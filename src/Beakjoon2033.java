import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2033 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String n= br.readLine();
        boolean check= false;

        for (int i = n.length() - 1; i > 0; i--) {
            int num = (n.charAt(i) - '0') + (check ? 1 : 0);

            if (num >= 5) check = true;
            else check = false;
        }

        System.out.println((int) (((n.charAt(0) - '0') + (check ? 1 : 0)) * Math.pow(10, n.length() - 1)));
    }
}
/*
99999999
100000000
 */