import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon1952 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken());    //가로
        int m= Integer.parseInt(st.nextToken());    //세로
        int ans= 0;


        boolean board[][]= new boolean[n][m];
        //우,하,좌,상
        int dx[]= {1,0,-1,0};
        int dy[]= {0,1,0,-1};
        int d= 0;
        int x= 0;
        int y= 0;
        board[x][y]=true;
        boolean check= true;

        while(check){
            while((0<=x+dx[d]&&x+dx[d]<m)&&(0<=y+dy[d]&&y+dy[d]<n)){
                if(board[y+dy[d]][x+dx[d]]) {
                    break;
                }
                else{
                    x+=dx[d];
                    y+=dy[d];
                    board[y][x]=true;
                }
            }
            ans++;

            d= (d+1)%4;
            check= false;
            for(int i=0;i<4;i++){
                if((0<=x+dx[i]&&x+dx[i]<m)&&(0<=y+dy[i]&&y+dy[i]<n)) {
                    if (!board[y + dy[i]][x + dx[i]]) {
                        check = true;
                        break;
                    }
                }
            }
        }

        System.out.println(ans-1);

    }
}
