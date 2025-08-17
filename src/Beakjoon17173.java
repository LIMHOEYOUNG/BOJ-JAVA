import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Beakjoon17173 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        long ans= 0;

        st= new StringTokenizer(br.readLine());
        //ArrayList<Integer> arr= new ArrayList<>();
        int[] k= new int[m];

        for(int i=0;i<m;i++){
            //if(Integer.parseInt(st.nextToken())%2)
            k[i]= Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<k.length;j++){
                if(i%k[j]==0){
                    ans+=i;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
