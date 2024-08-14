import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon26560 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            String str= br.readLine();
            if(str.charAt(str.length()-1)!='.'){
                //str+=".";
                sb.append(str+"."+'\n');
            }
            else{
                sb.append(str+"\n");
            }
        }

        System.out.println(sb);
    }
}
