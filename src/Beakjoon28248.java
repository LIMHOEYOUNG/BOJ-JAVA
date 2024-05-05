import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon28248 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int p= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());

        int score= 50*p - 10*c;

        if(p>c){
            score+=500;
        }

        System.out.println(score);
    }
}
