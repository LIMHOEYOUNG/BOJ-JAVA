import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon16017 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        boolean check= false;

        int n1= Integer.parseInt(br.readLine());
        int n2= Integer.parseInt(br.readLine());
        int n3= Integer.parseInt(br.readLine());
        int n4= Integer.parseInt(br.readLine());


        if((n1==8 || n1==9)&&(n2==n3)&&(n4==8 ||n4==9)) check=!check;

        if(check) System.out.println("ignore");
        else System.out.println("answer");
    }
}
