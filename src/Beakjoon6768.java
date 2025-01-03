import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6768 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine())-1;

        /*
        nCr
        n= 입력-1
        r=3;
         */

        long check= (n*(n-1)*(n-2))/6;

        System.out.println(check<0?0:check);
    }
}
