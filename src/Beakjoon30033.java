import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int arr[][]= new int[2][n];
        int a=0;
        for(int i=0;i<2;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                arr[a][j]=Integer.parseInt(st.nextToken());
            }
            a++;
        }

        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[0][i]<=arr[1][i]) ans++;
        }

        System.out.println(ans);
    }
}
