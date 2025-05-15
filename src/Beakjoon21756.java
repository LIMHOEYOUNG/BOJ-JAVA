import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon21756 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //int n= Integer.parseInt(br.readLine());

        //System.out.println(n%4!=0?(Math.pow(4,(int)Math.pow(n, 0.25))):());

        for(int n=1;n<=100;n++) {
            if (n == 1) System.out.println(1);
            else if (n < 4) System.out.println(2);
        /*
        else System.out.println((int)Math.pow(2,(int)Math.sqrt(n)));
         */

                //System.out.println((int)Math.pow(2,(int)Math.sqrt(n)));

                // System.out.println(((int)Math.sqrt(n))+"===>"+((int)Math.pow(2,(int)Math.sqrt(n))));

                //System.out.println(((int)Math.sqrt(n))+"===>"+((int)Math.pow(2,(int)Math.sqrt(n))));
                //System.out.println(((int)Math.pow(n,0.25))+"===>"+((int)Math.pow(4,(int)Math.pow(n,0.25))));
            else {
                for (int i = 4; i <= 100; i = i * 2) {
                    if (i <= n && n <= i * 2 - 1) {
                        System.out.println(n+" => "+i);
                        break;
                    }
                }
            }
        }
    }
}

/*
64
100
 */
