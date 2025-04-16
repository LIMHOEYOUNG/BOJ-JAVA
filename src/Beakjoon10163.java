import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10163 {
    public static int configure_paper[][]= new int[1002][1002];
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        int ans[]= new int[n+1];

        for(int t=1;t<=n;t++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());
            int w= Integer.parseInt(st.nextToken());
            int h= Integer.parseInt(st.nextToken());

            for(int i=x;i<(x+w);i++){
                for(int j=y;j<(y+h);j++){
                    ans[configure_paper[i][j]]--;
                    configure_paper[i][j]=t;
                    ans[t]++;
                }
            }
        }

        for(int i=1;i<=n;i++) sb.append(ans[i]+"\n");

        System.out.println(sb);
    }
}