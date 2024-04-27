import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6778 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        if(antenna>=3 && eyes<=4){
            sb.append("TroyMartian\n");
        }
        if(antenna<=6 && eyes>=2){
            sb.append("VladSaturnian\n");
        }
        if(antenna<=2 && eyes<=3){
            sb.append("GraemeMercurian\n");
        }

        System.out.println(sb);
    }
}
