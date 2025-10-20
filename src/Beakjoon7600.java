import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon7600 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        while(true){
            boolean[] check= new boolean[26];
            int ans= 0;
            String str= br.readLine();
            if(str.equals("#")) break;
            str= str.toLowerCase();

            for(int i=0;i<str.length();i++){
                char c= str.charAt(i);
                if('a'<=c && c<='z' && !check[c-'a']){
                    ans+=1;
                    check[c-'a']= true;
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
