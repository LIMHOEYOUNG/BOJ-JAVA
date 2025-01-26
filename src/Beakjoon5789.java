import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            String str= br.readLine();
            int len= str.length()/2;

            if(str.charAt(len) == str.charAt(len-1)){
                sb.append("Do-it\n");
            }
            else{
                sb.append("Do-it-Not\n");
            }
        }

        System.out.println(sb);
    }
}
