import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        String str[]={"STAR","UNIVERSE","PINKBEAN","UNIVERSESTAR","UNIVERSEPINKSTAR"};
        int num[]= new int[26];

        for(int i=0;i<str.length;i++){
            String check= str[i];
            for(int j=0; j<check.length();j++){
                num[check.charAt(j)-'A']++;
            }
        }

        for(int i=0;i<26;i++){
            System.out.println((char)(i+97)+" = "+num[i]);
        }
    }
}
