import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon33170 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total= 0;

        for(int i=0;i<3;i++){
            total+=Integer.parseInt(br.readLine());
        }

        System.out.println(total<=21?1:0);
    }
}
