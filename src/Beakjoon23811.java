import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon23811 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();

        /*
        String s1= "@@@@@".repeat(n);
        String s2= "@".repeat(n);
         */

        for(int i=0;i<n;i++){
            s1.append("@@@@@");
            s2.append("@");
        }

        StringBuilder sb= new StringBuilder();
        boolean flag= true;

        for(int i=0;i<5;i++){

            for(int j=0;j<n;j++){
                sb.append(flag?s1:s2).append("\n");
            }
            flag=!flag;
        }

        System.out.print(sb);

    }
}
