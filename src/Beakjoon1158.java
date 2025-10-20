import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Beakjoon1158 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        Queue<Integer> q= new LinkedList<>();

        for(int i=1;i<=n;i++){
            q.offer(i);
        }

        int cnt= 0;
        StringBuilder sb= new StringBuilder("<");

        while(q.size()>1){
            int check= q.poll();

            if(cnt!=(k-1)) q.offer(check);
            else sb.append(check).append(", ");

            cnt= (cnt+1)%k;
        }

        sb.append(q.poll()).append(">");

        System.out.print(sb);
    }
}
