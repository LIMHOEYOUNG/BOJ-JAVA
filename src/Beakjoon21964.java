import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon21964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(br.readLine());
        String str= br.readLine();
        for(int i=a-5;i<a;i++){
            System.out.print(str.charAt(i));
        }
    }
}
