import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32905 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            int cnt=0;

            for(int j=0;j<m;j++){
                String s= st.nextToken();

                if(s.equals("A")){
                    cnt++;
                }
            }

            if(cnt!=1){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
