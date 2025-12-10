import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon8974 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int idx= 1;
        int std= 1;
        int add_cnt= 0;
        int cnt=b-a+1;
        int ans=0;

        while(true){
            for(int i=1;i<=std;i++){
                if(a<=idx && idx<=b){
                    ans+= std;
                    add_cnt++;
                }

                idx++;
            }
            std++;

            if(add_cnt==cnt) break;
        }

        System.out.println(ans);
    }
}
