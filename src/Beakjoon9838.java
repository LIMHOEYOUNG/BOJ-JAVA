import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon9838 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int pickUp[]= new int[n+1];

        for(int i=1;i<=n;i++){
            pickUp[i]=Integer.parseInt(br.readLine());
        }

        StringBuilder sb= new StringBuilder();

        int cnt= 1;
        while(cnt<pickUp.length){
            for(int i=1;i<pickUp.length;i++){
                if(cnt==pickUp[i]) {
                    sb.append(i+"\n");
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
