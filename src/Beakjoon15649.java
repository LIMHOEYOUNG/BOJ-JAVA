import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15649 {
    private static StringBuilder sb= new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int point[]= new int[m];
        boolean visited[]= new boolean[n+1];

        backTracking(n,m,0,point,visited);

        System.out.print(sb);
    }

    private static void backTracking(int n, int m, int d,int point[], boolean visited[]){
        if(m==d){
            for(int p:point){
                sb.append(p+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                point[d]=i;
                backTracking(n,m,d+1,point,visited);
                visited[i]=false;
            }
        }
    }
}
