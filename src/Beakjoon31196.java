import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31196 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        StringBuilder sb= new StringBuilder();
        int str_len= str.length();

        int a= 1;
        for(int i=1; i<str_len;i++){
            int s= str_len/i;

            if(i*s==str_len && s>=i) {
                a=i;
            }
        }

        int s= str_len/a;
        for(int i=0;i<a;i++){
            for(int j=0;j<s;j++){
                sb.append(str.charAt(i + j*a));
            }
        }

        System.out.println(sb);
    }
}
