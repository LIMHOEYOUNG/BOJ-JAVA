import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //10996
        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        String star1= "* ";
        String star2= " *";

        star1= star1.repeat(n-(n/2));
        star2= star2.repeat(n/2);

        for(int i=0;i<n;i++){
            sb.append(star1+"\n"+star2+"\n");
        }

        System.out.print(sb);
    }
}

//1463, 토마토 다시
