import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Beakjoon23080 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        Random rd= new Random();
        if(rd.nextBoolean()) method1(str, n);
        else method2(str, n);
    }

    private static void method1(String str, int n){
        String s[]= str.split("");
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<s.length;i+=n){
            sb.append(s[i]);
        }

        System.out.println(sb);
    }

    private static void method2(String str, int n){
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i+=n){
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }
}
