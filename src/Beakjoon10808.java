import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        int num[]= new int[26];
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            num[c-'a']++;
        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
