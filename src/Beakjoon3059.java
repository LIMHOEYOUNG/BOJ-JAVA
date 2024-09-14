import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3059 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long n= Long.parseLong(br.readLine());

        StringBuilder sb= new StringBuilder();

        int total=2015;

        //boolean check[]= new boolean[26];

        while(n-->0){
            String str= br.readLine();
            int cnt=0;
            boolean check[]= new boolean[26];

            for(int i=0;i<str.length();i++){
                if(check[str.charAt(i)-65]) continue;
                cnt+=(int)str.charAt(i);
                check[str.charAt(i)-65]=true;
            }

            sb.append((total-cnt)+"\n");
        }

        System.out.println(sb);
    }
}
