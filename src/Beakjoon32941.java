import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int t= Integer.parseInt(st.nextToken());
        int x= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(br.readLine());

        int ans=0;
        boolean check= false;

        for(int i=0;i<n;i++){

            int k= Integer.parseInt(br.readLine());
            st= new StringTokenizer(br.readLine());

            for(int j=0;j<k;j++){
                if(Integer.parseInt(st.nextToken()) == x){
                    ans++;
                    check= true;
                    break;
                }
                else{
                    check= false;
                    break;
                }
            }

            if(!check) break;
        }

        //System.out.println(n==ans?"YES":"NO");
        System.out.println(check?"YES":"NO");
    }
}
