import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4766 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        double temperature1= Double.parseDouble(br.readLine());
        while(true){
            //if(temperature1==999) break;
            double temperature2= Double.parseDouble(br.readLine());
            if(temperature2==999) break;
            sb.append(String.format("%.2f\n",temperature2-temperature1));
            temperature1=temperature2;
        }

        System.out.println(sb);
    }
}
