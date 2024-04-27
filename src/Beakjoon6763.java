import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6763 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int limit= Integer.parseInt(br.readLine());
        int speed= Integer.parseInt(br.readLine());

        int check = speed-limit;
        if(check<1){
            System.out.println("Congratulations, you are within the speed limit!");
        }
        else if(1<=check && check<=20){
            System.out.println("You are speeding and your fine is $100.");
        }
        else if(21<=check && check<=30){
            System.out.println("You are speeding and your fine is $270.");
        }
        else{
            System.out.println("You are speeding and your fine is $500.");
        }

    }
}
