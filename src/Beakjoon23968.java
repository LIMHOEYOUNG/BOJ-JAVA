import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon23968 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int[] ans= new int[2];
        int[] num= new int[n+1];

        st= new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            num[i]= Integer.parseInt(st.nextToken());
        }

        int cnt= 0;
        for(int i=0;i<n && cnt!=k;i++){
            for(int j=1;j<=n-i-1 && cnt!=k;j++){
                if(num[j]>num[j+1]){
                    cnt++;
                    int tmp= num[j];
                    num[j]= num[j+1];
                    num[j+1]= tmp;

                    //System.out.println(Arrays.toString(num)+" cnt=> "+cnt+" | "+num[j+1]+" "+num[j]+" | j= "+j);
                }

                if(cnt==k) {
                    ans[0]= num[j];
                    ans[1]= num[j+1];
                }
            }
        }

        System.out.println(cnt!=k?-1:(ans[0]+" "+ans[1]));
    }
}
