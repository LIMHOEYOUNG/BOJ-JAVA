import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon18406 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //int n= Integer.parseInt(br.readLine());
        String n= br.readLine();

        long l= 0;
        long r= 0;
        int len= n.length();
        for(int i=0;i<len/2;i++){
            l+= n.charAt(i)-'0';
            r+= n.charAt(len-i-1)-'0';
        }

        //System.out.println(l+" "+r);
        System.out.println(l==r?"LUCKY":"READY");
    }
}
