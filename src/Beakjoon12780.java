import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon12780 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        String word= br.readLine();
        int word_len= word.length();
        int str_len= str.length();
        int ans= 0;

        for(int i=0;i<str_len;i++){
            if(i+word_len>str_len) break;
            String sub_str= str.substring(i,i+word_len);

            if(sub_str.equals(word)) {
                ans+=1;
            }
        }

        System.out.println(ans);
    }
}
