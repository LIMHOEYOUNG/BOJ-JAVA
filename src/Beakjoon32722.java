import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        boolean check1=false, check2=false, check3=false;

        int n= Integer.parseInt(br.readLine());
        if(n==1 ||n==3) check1=!check1;

        n= Integer.parseInt(br.readLine());
        if(n==6 ||n==8) check2=!check2;

        n= Integer.parseInt(br.readLine());
        if(n==2 ||n==5) check3=!check3;


        System.out.println((check1&&check2&&check3)?"JAH":"EI");
    }
}
