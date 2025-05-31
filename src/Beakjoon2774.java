import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Beakjoon2774 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine();
            int ans= 0;
            boolean num[]= new boolean[10];

            for(int i=0;i<str.length();i++){
                int c= str.charAt(i)-'0';
                if(!num[c]) {
                    ans++;
                    num[c]=!num[c];
                }
            }

            sb.append(ans+"\n");
        }

        System.out.print(sb);
    }

}
