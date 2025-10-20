import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon23803 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        /*
        // JAVA15, JAVA11
        String str1= ("@".repeat(n)+"\n").repeat(4);
        String str2= "@@@@@".repeat(n)+"\n";

        System.out.print(str1.repeat(n));
        System.out.print(str2.repeat(n));
        */

        StringBuilder sb1= new StringBuilder(),sb2= new StringBuilder();

        for(int i=0;i<n;i++){
            if(i==0){
                for(int j=0;j<n;j++){
                    sb1.append("@");
                    sb2.append("@@@@@");
                }
                sb1.append("\n");
                sb1.append(sb1);
            }
            sb1.append(sb1);
            sb2.append(sb2).append("\n");
        }
        System.out.print(sb1.toString()+sb2.toString());
    }
}