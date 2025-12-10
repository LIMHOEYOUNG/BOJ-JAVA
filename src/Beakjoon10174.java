import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10174 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine().toLowerCase();
            int s_len= str.length();
            boolean flag= false;

            for(int i=0;i<s_len/2;i++){

                if(str.charAt(i)!=str.charAt(s_len-i-1)){
                    flag= true;
                    break;
                }

            }

            sb.append(flag?"No":"Yes").append("\n");

        }

        System.out.print(sb);
    }
}
