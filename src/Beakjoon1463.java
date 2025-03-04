import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1463 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1463
        int x= Integer.parseInt(br.readLine());
        System.out.println(dp(x,0));
    }

    public static int dp(int x, int count){

        if(x<2){
            return count;
        }
        else {
            int div_2_x= x/2;
            int div_2_count= x%2 + count+1;
            int div_3_x= x/3;
            int div_3_count= x%3 + count+1;
            return Math.min(dp(div_2_x,div_2_count), dp(div_3_x,div_3_count));
        }
    }
}
