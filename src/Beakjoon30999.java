import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        int ans=0;
        for(int i=0;i<n;i++){
            String str= br.readLine();

            int cnt=0;
            int std= (m+1)/2;

            for(int j=0;j<m;j++){
                char c= str.charAt(j);

                if(c=='O'){
                    cnt++;

                    if(cnt>=std){
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
