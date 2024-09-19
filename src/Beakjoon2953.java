import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int line= 0;
        int ans=0;

        for(int i=1;i<=5;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int sum=0;
            for(int j=0;j<4;j++){
                sum+=Integer.parseInt(st.nextToken());
            }

            if(ans<sum){
                line=i;
                ans=sum;
            }
        }

        System.out.println(line+" "+ans);
    }
}
