import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans= 0;

        for(int i=1;i<=n;i++){
            String num= Integer.toString(i);

            for(int j=0;j<num.length();j++){
                int check= num.charAt(j)-'0';

                if(check!=0&&check%3==0) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
