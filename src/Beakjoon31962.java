import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon31962 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int x= Integer.parseInt(st.nextToken());

        int ans=-1;
        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());

            int s= Integer.parseInt(st.nextToken());
            int t= Integer.parseInt(st.nextToken());

            if(((s+t)<=x)&&ans<s){
                ans=s;
            }
        }

        System.out.println(ans);
    }
}
