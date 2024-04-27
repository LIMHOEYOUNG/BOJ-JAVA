import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1718 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        String encryptionKey= br.readLine();

        int k=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c==' '){
                sb.append(" ");
                k++;
                k%=encryptionKey.length();
                continue;
            }
            int check=c-encryptionKey.charAt(k);
            if(check<=0){
                sb.append((char)('z'+check));
            }
            else if(check>0) {
                sb.append((char)('a'+check-1));
            }
            k++;
            k%=encryptionKey.length();
        }

        System.out.println(sb);
    }
}