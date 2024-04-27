import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int t[]= new int[n];

        for(int i=0;i<n;i++){
            t[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(t);

        int wait= 0;
        int ans= 0;

        for(int i=0;i<n;i++){
            ans+=wait+t[i];
            wait+=t[i];
        }

        System.out.println(ans);
    }
}
