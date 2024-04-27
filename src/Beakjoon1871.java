import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1871 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            String str = br.readLine();
            String front = str.substring(0,3);
            int back = Integer.parseInt(str.substring(4,str.length()));
            //System.out.println("front = "+front+" back = "+back);
            if(Math.abs(translateNum(front)-back)<=100) sb.append("nice\n");
            else sb.append("not nice\n");
        }
        System.out.println(sb);
    }

    public static long translateNum(String str){
        long result=0;
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            result += (long)(c-'A')*Math.pow(26,(str.length()-i-1));
        }
        return result;
    }
}
