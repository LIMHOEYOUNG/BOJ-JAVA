import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon17202 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer num1= new StringTokenizer(br.readLine());
        //StringTokenizer num2= new StringTokenizer(br.readLine());
        String num1= br.readLine();
        String num2= br.readLine();

        StringBuilder sb= new StringBuilder();
        StringBuilder sb2= new StringBuilder();

        for(int i=0;i<num1.length();i++){
            sb.append(num1.charAt(i)).append(num2.charAt(i));
        }

        //System.out.println(sb+" "+sb.length());


        while(true){
            if(sb.length()==2) break;
            String str= sb.toString();

            for(int i=0;i<sb.length()-1;i++){
                sb2.append((((str.charAt(i)-'0')+(str.charAt(i+1)-'0'))%10));
            }

            sb= new StringBuilder(sb2);
            sb2.setLength(0);

            System.out.println(sb);
        }

        System.out.println(sb);
    }
}
/*
14549063
00556281
 */