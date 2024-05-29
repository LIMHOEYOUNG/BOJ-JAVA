import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon29807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int num[]=new int[6];
        for(int i=1;i<=t;i++){
            num[i]= Integer.parseInt(st.nextToken());
        }

        int ans=((num[1]>num[3]?Math.abs(num[1]-num[3])*508:Math.abs(num[1]-num[3])*108)
                +(num[2]>num[4]?Math.abs(num[2]-num[4])*212:Math.abs(num[2]-num[4])*305)
                +(num[5]*707))*4763;

        System.out.println(ans);
    }
}
