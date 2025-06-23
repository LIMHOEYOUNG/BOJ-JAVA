import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6131 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans= 0;

        for(int i=1;i<=500;i++){
            for(int j=1;j<=i;j++){
                if(Math.pow(i,2)-Math.pow(j,2)==n) {
                    ans++;
                    break;
                }
            }
        }

        System.out.println(ans);
    }

}
