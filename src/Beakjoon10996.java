import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10996 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //10996
        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        String star1= "* ";
        String star2= " *";

        /*
        윗줄 별 수 => 1(1) 2(1) | 3(2) 4(2) | 5(3) 6(3) | 7(4) 8(4) | 9(5) 10(5)
        => N - (N/2)

        아랫 줄 별 => 1(0) | 2(1) 3(1) | 4(2) 5(2) | 6(3) 7(3) | 8(4) 9(4) | 10(5)
        => N/2
         */
        for(int i=0;i<(n-(n/2));i++){
            star1= star1+star1;
        }
        for(int i=0;i<(n/2);i++){
            star2= star2+star2;
        }
        //star1= star1.repeat(n-(n/2));
        //star2= star2.repeat(n/2);

        for(int i=0;i<n;i++){
            sb.append(star1+"\n"+star2+"\n");
        }

        System.out.print(sb);
    }
}
