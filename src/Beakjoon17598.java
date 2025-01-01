import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int l= 0;
        int t= 0;

        for(int i=0;i<9;i++){
            String str= br.readLine();

            if(str.equals("Lion")) l++;
            else t++;
        }

        System.out.println(l>t?"Lion":"Tiger");
    }
}
