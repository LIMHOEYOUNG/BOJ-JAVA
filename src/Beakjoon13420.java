import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon13420 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String[] str= br.readLine().split(" ");
            long a= Long.parseLong(str[0]);
            long b= Long.parseLong(str[2]);
            long c= Long.parseLong(str[4]);

            switch (str[1]){
                case "+":
                    sb.append((a+b==c)?"correct":"wrong answer").append("\n");
                    break;
                case "-":
                    sb.append((a-b==c)?"correct":"wrong answer").append("\n");
                    break;
                case "*":
                    sb.append((a*b==c)?"correct":"wrong answer").append("\n");
                    break;
                case "/":
                    sb.append((a/b==c)?"correct":"wrong answer").append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
