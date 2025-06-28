import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1149 {
    private static int cost[][];
    private static int ans[][];
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        cost= new int[n][3];
        ans= new int[n][3];

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            for(int j=0;j<3;j++){
                cost[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        calc();

        System.out.print(cost_min(cost_min(ans[n-1][0],ans[n-1][1]),ans[n-1][2]));
    }

    private static void calc(){
        // 점화식 해결
        // dp[n]= dp[n-1](n-1번째와 n-2번째의 최소값의 합)+cost[n](현재 최소값)
        // 1 2 3
        // 1 4 2
        // 1 3 2
        // (1)->(3)->(1) 합이 4
        // 1번째 집에서 R를 칠했을 경우, G를 칠했을 경우, B을 칠했을 경우
        // 총 3경우를 구하고 그 셋 중에 최솟값을 구하면 된다.

        // 1번째 집 먼저 입력
        ans[0][0]= cost[0][0];
        ans[0][1]= cost[0][1];
        ans[0][2]= cost[0][2];
        for(int i=1;i<ans.length;i++){
            ans[i][0]= cost_min(ans[i-1][1],ans[i-1][2])+ cost[i][0];
            ans[i][1]= cost_min(ans[i-1][0],ans[i-1][2])+ cost[i][1];
            ans[i][2]= cost_min(ans[i-1][0],ans[i-1][1])+ cost[i][2];
        }
    }

    private static int cost_min(int a, int b){
        return a>b?b:a;
    }
}
/*
3
1 2 3
1 4 2
1 3 2
 */