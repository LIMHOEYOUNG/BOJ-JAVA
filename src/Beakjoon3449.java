import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3449 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            String str1= br.readLine();
            String str2= br.readLine();

            int count=0;
            for(int i=0;i<str1.length();i++){
                char c= str1.charAt(i);
                if(c!=str2.charAt(i)) count++;
            }

            sb.append("Hamming distance is "+count+".\n");
        }

        System.out.println(sb);
    }
}
