import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2435 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        int arr[]= new int[n];
        st= new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        int max= Integer.MIN_VALUE;
        for(int i=0;i<(n-k+1);i++){
            int check= 0;
            for(int j=i;j<i+k;j++){
                check+=arr[j];
            }

            max= Math.max(max,check);
        }

        System.out.println(max);
    }
}