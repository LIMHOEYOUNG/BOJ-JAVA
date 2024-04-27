import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6825 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double weight= Double.parseDouble(br.readLine());
        double height= Double.parseDouble(br.readLine());

        double bmi= weight/(height * height);

        //System.out.println("BMI = "+bmi);

        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(18.5<=bmi && bmi<=25.0){
            System.out.println("Normal weight");
        }
        else{
            System.out.println("Overweight");
        }
    }
}
