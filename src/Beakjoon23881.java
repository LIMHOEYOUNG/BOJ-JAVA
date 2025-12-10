import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon23881 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int[] num= new int[n+1];
        st= new StringTokenizer(br.readLine());

        for(int i=1;i<=n;i++){
            num[i]= Integer.parseInt(st.nextToken());
        }

        int cnt= 0;
        for(int i=n;i>0;i--){
            int max_value_idx= 0;
            int max_value= 0;

            for(int j=1;j<=i;j++){
                if(max_value<num[j]){
                    max_value=num[j];
                    max_value_idx=j;
                }
            }

            if(max_value_idx!=i){
                int tmp= num[i];
                num[i]=max_value;
                num[max_value_idx]= tmp;
                cnt++;
            }

            if(cnt==m) {
                sb.append(num[max_value_idx]).append(" ").append(num[i]);
                break;
            }
        }

        if(cnt<m){
            sb.append(-1);
        }

        //System.out.println(Arrays.toString(num));
        System.out.println(sb);
    }
}
