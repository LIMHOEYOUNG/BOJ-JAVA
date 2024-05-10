import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon27257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int ans=0;

        String str= br.readLine();
        int s=0;
        int e=0;

        for(int i=0;i<str.length(); i++){
            if(str.charAt(i)!='0'){
                s=i;
                break;
            }
        }

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!='0'){
                e=i;
                break;
            }
        }

        for(int i=s;i<=e;i++){
            if(str.charAt(i)=='0') ans++;
        }

        System.out.println(ans);
    }
}
