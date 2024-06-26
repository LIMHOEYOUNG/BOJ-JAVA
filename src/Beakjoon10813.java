import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        int num[]= new int[n+1];
        for(int i=1;i<=n;i++){
            num[i]=i;
        }

        for(int i=0;i<m;i++){
            st= new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int tmp= num[a];
            num[a]=num[b];
            num[b]=tmp;
        }

        for(int i=1;i<=n;i++){
            System.out.print(num[i]+" ");
        }
    }
}
