import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4806 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int answer= 0;

        while(true){
            String str= br.readLine();
            if(str==null) break;
            answer++;
        }

        System.out.println(answer);
    }
}
