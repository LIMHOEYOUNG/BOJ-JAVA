import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Beakjoon3059 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        int total=2015;
        boolean check[]= new boolean[26];

        while(n-->0){
            String str= br.readLine();
            int cnt=0;

            for(int i=0;i<str.length();i++){
                if(check[str.charAt(i)-65]) continue;
                cnt+=str.charAt(i);
                check[str.charAt(i)-65]=true;
            }

            Arrays.fill(check,false);
            sb.append((total-cnt)+"\n");
        }

        System.out.println(sb);
    }
}
