import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17294 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        if(str.length()!=1) {
            int d= str.charAt(1)-str.charAt(0);
            for (int i=2;i<str.length();i++) {
                int check= str.charAt(i)-str.charAt(i-1);
                if (check!=d) {
                    System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
                    return;
                }
            }
        }
        System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
    }
}
