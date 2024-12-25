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

        for(int i=0;i<n;i++){
            boolean check= false;

            int k= Integer.parseInt(br.readLine());
            st= new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                if(Integer.parseInt(st.nextToken()) == x){
                    check= true;
                    break;
                }
            }

            if(!check){
                System.out.println("N0");
                return;
            }
        }

        System.out.println("YES");
    }
}
