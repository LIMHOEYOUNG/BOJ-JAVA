import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2495 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<3;i++){
            String str= br.readLine();
            int ans= 1;
            int max= 0;

            for(int j=1;j<str.length();j++){
                char c= str.charAt(j);
                if(c== str.charAt(j-1)) ans++;
                else{
                    ans= 1;
                }

                max= Math.max(max,ans);
            }

            sb.append(max+"\n");
        }

        System.out.println(sb);
    }
}
