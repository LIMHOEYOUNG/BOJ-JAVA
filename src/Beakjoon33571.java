import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon33571 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        char c[]= {'A','a','b','D','d','e','g','O','o','P','p','Q','q','R','@'};
        //System.out.println(br.readLine().length());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int ans= 0;

        while(st.hasMoreTokens()){
            String str= st.nextToken();

            for(int i=0;i<str.length();i++){
                char check= str.charAt(i);
                if(check=='B') ans+=2;
                else{
                    for(int j=0;j<c.length;j++){
                        if(c[j]==check) {
                            ans++;
                            //System.out.println(check);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
/*
dimigo is the best high school @@@AC ERtDQ BDBTyuo
 */