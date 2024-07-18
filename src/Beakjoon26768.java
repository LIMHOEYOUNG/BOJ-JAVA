import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon26768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        StringBuilder sb= new StringBuilder();

        sb.append(str.replace("a", "4").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5"));

        System.out.println(sb);
    }
}
