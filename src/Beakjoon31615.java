import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31615 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine())+Integer.parseInt(br.readLine());

        System.out.println((n/100)>0?3:(n/10)>0?2:1);
    }
}
