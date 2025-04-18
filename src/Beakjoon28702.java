import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon28702 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= 0;
        for(int i=0;i<3;i++){
            String str= br.readLine();
            char c= str.charAt(0);

            if(!(c=='F') && !(c=='B')){
                n= Integer.parseInt(str)+(3-i);
                break;
            }
        }


        if(n%15==0) System.out.println("FizzBuzz");
        else{
            if(n%3==0) System.out.println("Fizz");
            else if(n%5==0) System.out.println("Buzz");
            else System.out.println(n);
        }
    }
}
