import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long a= Long.parseLong(br.readLine());
        long b= Long.parseLong(br.readLine());
        long c= Long.parseLong(br.readLine());

        String str= Long.toString(a*b*c);

        int num[]= new int[10];

        for(int i=0;i<str.length();i++){
            num[Character.getNumericValue(str.charAt(i))]++;
        }

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);
        System.out.println(num[7]);
        System.out.println(num[8]);
        System.out.println(num[9]);
    }
}
