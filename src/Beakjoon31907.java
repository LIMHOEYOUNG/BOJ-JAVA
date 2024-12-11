import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31907 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb1= new StringBuilder((re("G",n)+re("...",n)+"\n").repeat(n));
        sb1.append((re(".",n)+re("I",n)+re(".",n)+re("T",n)+"\n").repeat(n)).append((re("..",n)+re("S",n)+re(".",n)+"\n").repeat(n));

        System.out.print(sb1);
    }

    public static String re(String s, int n){
        return s.repeat(n);
    }
}