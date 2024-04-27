import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1975 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<t;i++){
            sb.append(cal(Integer.parseInt(br.readLine()))+"\n");
        }

        System.out.println(sb);
    }


    public static int cal(int n){
        int answer =0;

        for(int i=2;i<=n;i++){
            int target = n;
            while(true){
                if(target%i!=0) break;
                answer++;
                target/=i;
            }
        }

        return answer;
    }
}
