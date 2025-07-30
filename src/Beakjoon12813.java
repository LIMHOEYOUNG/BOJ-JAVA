import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon12813 {

    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        StringBuilder sb3= new StringBuilder();
        StringBuilder sb4= new StringBuilder();

        String str1= br.readLine();
        String str2= br.readLine();

        for(int i=0;i<str1.length();i++){
            int b1= str1.charAt(i)-'0';
            int b2= str2.charAt(i)-'0';
            sb.append(b1&b2);
            sb1.append(b1|b2);
            sb2.append(b1^b2);
            sb3.append(b1^1);
            sb4.append(b2^1);
        }

        System.out.println(sb+"\n"+sb1+"\n"+sb2+"\n"+sb3+"\n"+sb4);
    }
}