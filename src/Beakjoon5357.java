import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5357 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            char before_check=' ';
            String str= br.readLine();
            for(int j=0;j<str.length();j++){
                char check = str.charAt(j);
                if(before_check==check){
                    before_check=check;
                    continue;
                }
                sb.append(check);
                before_check=check;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

/*
String str= br.readLine();
            for(int j=0;j<str.length();j++){
                if(j==0) {
                    sb.append(str.charAt(j));
                    continue;
                }
                if(str.charAt(j-1)==str.charAt(j)){
                    continue;
                }
                sb.append(str.charAt(j));
            }
            sb.append("\n");
 */
