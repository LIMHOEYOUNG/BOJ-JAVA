import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int n =Integer.parseInt(br.readLine());

        while (n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int ans=0;
            int minNum= Integer.MAX_VALUE;
            while(st.hasMoreTokens()){
                int num= Integer.parseInt(st.nextToken());
                if(num%2==0){
                    minNum=Math.min(minNum,num);
                    ans+=num;
                }
            }
            sb.append(ans+" "+minNum+"\n");
        }

        System.out.println(sb);
    }
}
