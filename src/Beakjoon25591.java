import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int num1= Integer.parseInt(st.nextToken());
        int num2= Integer.parseInt(st.nextToken());
        int a= 100-num1;
        int b= 100-num2;
        int c= 100-(a+b);
        int d= a*b;
        int q= d/100;
        int r= d%100;

        System.out.println(a+" "+b+" "+c+" "+d+" "+q+" "+r);
        System.out.println(((num1*num2)/100)+" "+((num1*num2)%100));
    }
}
