import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon30501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine();

            for(int i=0;i<str.length();i++){
                char c= str.charAt(i);
                if(c=='S') {
                    sb.append(str+"\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
