import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4841 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            String str= br.readLine();

            for(int i=0;i<str.length();i++){
                int cnt= 1;
                int target= str.charAt(i)-'0';

                if(i==str.length()-1) {
                    sb.append(cnt).append(str.charAt(i));
                    break;
                }

                while(i<str.length()-1){
                    if(str.charAt(i)==str.charAt(i+1)){
                        cnt+=1;
                        i+=1;
                    }
                    else break;

                }

                sb.append(cnt).append(target);
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
