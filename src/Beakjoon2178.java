import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Beakjoon2178 {
    //상하좌우
    private static int dx[]={0,0,-1,1};
    private static int dy[]={1,-1,0,0};
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int route[][]= new int [n][m];

        for(int i=0;i<n;i++){
            String str= br.readLine();
            for(int j=0;j<m;j++){
                route[i][j]= str.charAt(j)-'0';
            }
        }
        figureOut(n,m,0,0,route);

        System.out.println(route[n-1][m-1]);

    }

    private static void figureOut(int n, int m, int x, int y, int route[][]){
        Queue<int[]> before= new LinkedList<>();
        before.offer(new int[]{x,y});     //시작 포인트

        while(!before.isEmpty()){
            int point[]= before.poll();

            //상하좌우 체크
            for(int i=0;i<4;i++){
                int moveX= point[0]+dx[i];
                int moveY= point[1]+dy[i];

                if((0<=moveX&&moveX<n) && (0<=moveY&&moveY<m)){
                    if(route[moveX][moveY]==1){

                        before.offer(new int[]{moveX,moveY});
                        route[moveX][moveY]=route[point[0]][point[1]]+1;
                    }
                }
            }
        }
    }
}