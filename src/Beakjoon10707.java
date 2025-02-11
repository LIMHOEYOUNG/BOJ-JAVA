import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10707 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());
        int d= Integer.parseInt(br.readLine());
        int p= Integer.parseInt(br.readLine());

        int xCompany= p*a;
        int yCompany= p<=c?b:b+(p-c)*d;

        System.out.println(Math.min(xCompany,yCompany));
    }
}
