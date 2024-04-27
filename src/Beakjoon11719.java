import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str= br.readLine();
            if(str.equals(null)) break;
            System.out.println(str);
        }

    }
}
