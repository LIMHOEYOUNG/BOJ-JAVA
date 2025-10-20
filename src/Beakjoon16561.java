import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon16561 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        /*
        9   =>  3,3,3(1) = 1
        12  =>  3,3,6(3) = 3
        15  =>  3,3,9(3) + 3,6,6(3) = 6
        18  =>  3,3,12(3) + 3,6,9(6) + 6,6,6(1) = 10
        21  =>  3,3,15(3) + 3,6,12(6) + 3,9,9(3) + 6,9,9(3) = 15
        24  =>  3,3,18(3) + 3,6,15(6) + 3,9,12(6) + 6,6,12(3) + 6,9,9(3) = 21
        27  =>  3,3,21(3) + 3,6,18(6) + 3,9,15(6) + 3,12,12(3) + 6,9,12(6) + 6,6,15(3) + 9,9,9(1) = 28
         */

        int init_Val= 0;
        int add_val= 1;

        for(int i=9;i<=n;i+=3){
            init_Val+= add_val;
            add_val+=1;
        }

        System.out.println(init_Val);
    }
}
