import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon29752 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int ans= 0;
        int cnt= 0;

        for(int i=0;i<n;i++){
            if(Integer.parseInt(st.nextToken())>0){
                cnt++;
            }
            else{
                ans= Math.max(ans,cnt);
                cnt= 0;
            }
        }

        ans= Math.max(ans,cnt);
        System.out.println(ans);
    }
}
