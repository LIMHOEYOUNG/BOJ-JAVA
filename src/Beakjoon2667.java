import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Beakjoon2667 {
    private static int[][] board;
    private static boolean[][] visited;
    private static int[] dx= {0,0,-1,1,0};
    private static int[] dy= {1,-1,0,0,0};
    private static int n;
    private static int cnt= 0;
    private static ArrayList<Integer> list= new ArrayList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        n= Integer.parseInt(br.readLine());
        board= new int[n+1][n+1];
        visited= new boolean[n+1][n+1];

        for(int i=1;i<=n;i++){
            String str= br.readLine();
            for(int j=1;j<=n;j++){
                board[i][j]= str.charAt(j-1)-'0';
            }
        }

        cal();

        StringBuilder sb= new StringBuilder(list.size()+"\n");
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)).append("\n");
        }

        System.out.print(sb);

        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
         */
    }

    private static void cal(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //int cnt= 0;
                if(!visited[i][j] & board[i][j]==1){
                    search(i,j);
                    //System.out.println(cnt);
                    if(cnt!=0) list.add(cnt);
                }

                cnt= 0;
            }
        }

    }

    private static void search(int x, int y){
        for(int i=0;i<5;i++){
            int m_x= x+dx[i];
            int m_y= y+dy[i];
            if((1<=m_x&&m_x<=n) && (1<=m_y && m_y<=n)) {
                if (!visited[m_x][m_y] && board[m_x][m_y] == 1) {
                    board[m_x][m_y]= list.size()+1;
                    cnt += 1;
                    visited[m_x][m_y] = true;
                    search(m_x, m_y);
                }
            }
        }
    }
}

/*
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000

5
10000
00000
00000
00000
00000

5
00010
00000
10000
00000
00000

5
10101
01010
10101
01010
10101

4
1001
1100
0110
0011

25
1111111111111111111111111
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1101010101010101010101011
1010101010101010101010101
1111111111111111111111111


25
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111
1111111111111111111111111

 */