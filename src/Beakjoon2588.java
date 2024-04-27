import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2588 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        StringBuffer sb= new StringBuffer();

        for(int i=num2.length()-1;i>=0;i--){
            int n= num2.charAt(i)-'0';
            sb.append((num1*n)+"\n");
        }
        sb.append(num1*Integer.parseInt(num2));
        System.out.println(sb);
    }
}
