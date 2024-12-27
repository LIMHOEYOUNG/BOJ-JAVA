import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4922 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            int n= Integer.parseInt(br.readLine());

            if(n==0) break;

            sb.append(n+" => ").append(((int)(Math.pow(n,2))-(n-1))).append("\n");

        }

        System.out.println(sb);
    }
}
