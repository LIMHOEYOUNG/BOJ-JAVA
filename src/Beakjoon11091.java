import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Beakjoon11091 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine();
            boolean[] alpha= new boolean[26];
            int total= 0;

            for(int i=0;i<str.length();i++){
                char c= str.charAt(i);
                if('a'<=c && c<='z'){
                    if(!alpha[c-'a']){
                        total+=1;
                        alpha[c-'a']= true;
                    }
                }
                else if('A'<=c && c<='Z'){
                    if(!alpha[c-'A']){
                        total+=1;
                        alpha[c-'A']= true;
                    }
                }
            }

            if(total==26){
                sb.append("pangram\n");
            }
            else{
                sb.append("missing ");
                for(int i=0;i<alpha.length;i++){
                    if(!alpha[i]) sb.append((char)(i+'a'));
                }
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }
}
