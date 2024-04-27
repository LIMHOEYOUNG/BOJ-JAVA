import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2028 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int testCase= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        while(testCase-->0){
            int n= Integer.parseInt(br.readLine());
            String num = Integer.toString(n*n);

//            System.out.println("뒷자리 : "+num.substring(num.length()-Integer.toString(n).length(),num.length()));
//            System.out.println("n = "+n);

            if(num.substring(num.length()-Integer.toString(n).length(),num.length()).equals(Integer.toString(n))){
                sb.append("YES\n");
            }
            else sb.append("NO\n");
            //System.out.println();


        }

        System.out.println(sb);
    }
}
