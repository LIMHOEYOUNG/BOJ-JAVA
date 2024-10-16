import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Beakjoon31520 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String num= br.readLine();
        int check= 1;

        for(char c:num.toCharArray()){
            if(c-'0'!=check++){
                System.out.println(-1);
                return;
            }
        }

        System.out.println(check-1);
    }
}
