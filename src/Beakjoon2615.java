import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2615 {
    private static int[] x= {0,0,-1,1,1,1,-1,-1};
    private static int[] y= {-1,1,0,0,1,-1,1,-1};
    private static int[][] board= new int[20][20];
    private static boolean[][] check_board= new boolean[20][20];
    private static int[] stone_loc= new int[2];
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        for(int i=1;i<20;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=1;j<20;j++){
                board[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1;i<20;i++){
            for(int j=1;j<20;j++){
                int cnt= 0;

                if(board[i][j]!=0){
                    cnt= check(i,j,1);
                }

                if(cnt==5){
                    System.out.println(board[i][j]+"\n"+stone_loc[0]+" "+stone_loc[1]);
                    return;
                }
            }
        }

        System.out.println(0);
    }

    private static int check(int i, int j, int cnt){
        int target= board[i][j];
        check_board[i][j]= true;
        int result= cnt;

        for(int d=0;d<x.length;d++){
            int mv_x= i;
            int mv_y= j;
            result= cnt;

            while(true){
                mv_x+=x[d];
                mv_y+=y[d];
                if((1<=mv_x && mv_x<=19) && (1<=mv_y && mv_y<=19)){
                    if(target!=board[mv_x][mv_y]) break;
                    check_board[mv_x][mv_y]= true;
                    result++;

                    if(result==5){
                        if(board_check_act(d,mv_x,mv_y)) {
                            return 1;
                        }
                        if(j<mv_y||(j==mv_y&&i<mv_x)){
                            stone_loc[0]=i;
                            stone_loc[1]=j;
                        }
                        else{
                            stone_loc[0]=mv_x;
                            stone_loc[1]=mv_y;
                        }
                    }
                }
                else break;

            }

            if(result==5) return result;
        }

        return result;
    }

    private static boolean board_check_act(int d,int i, int j){
        int cnt= 0;
        int mv_x= i;
        int mv_y= j;

        int[] check_d= new int[2];
        check_d[0]= x[d]==0?0:x[d]==1?-1:1;
        check_d[1]= y[d]==0?0:y[d]==1?-1:1;

        while(true){
            if((1<=mv_x && mv_x<=19) && (1<=mv_y && mv_y<=19)) {

                if(check_board[mv_x][mv_y]) {
                    cnt++;
                }
                else break;

            }
            else break;

            mv_x+=check_d[0];
            mv_y+=check_d[1];
        }

        return cnt!=5;
    }
}