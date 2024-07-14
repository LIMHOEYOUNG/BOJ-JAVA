import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon30045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans=0;

        while(n-->0){
            String str= br.readLine();

            for(int i=0;i<str.length()-1;i++){
                char c= str.charAt(i);
                if(c=='0'){
                    if(str.charAt(i+1)=='1'){
                        ans++;
                        //i++;
                        break;
                    }
                }
                if(c=='O'){
                    if(str.charAt(i+1)=='I'){
                        ans++;
                        //i++;
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
