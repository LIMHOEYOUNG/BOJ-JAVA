import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1813 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int num[]= new int[51];

        for(int i=0;i<n;i++){
            num[Integer.parseInt(st.nextToken())]++;
        }

        for(int i=50;i>=0;i--){
            if(num[i]==i){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
