import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon16916 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str1= br.readLine();
        String str2= br.readLine();

        System.out.println(str1.contains(str2)?1:0);
    }
}
