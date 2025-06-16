import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9455 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        StringBuilder sb3= new StringBuilder();

        int t= Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            boolean board[][]= new boolean[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
            int cnt= 0;

            for(int i=0;i<board.length;i++){
                st= new StringTokenizer(br.readLine());
                for(int j=0;j<board[0].length;j++){
                    board[i][j]= Integer.parseInt(st.nextToken())==1;
                }
            }
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    sb2.append((board[i][j]?1:0)+" ");
                }
                sb2.append("\n");
            }
            sb2.append("\n");

            for(int i=board.length-2;i>=0;i--){
                int cnt2= 0;
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]){
                        for(int k=i+1;k<board.length;k++){
                            if(board[k][j]) {
                                board[k-1][j]=true;
                                break;
                            }
                            else {
                                cnt++;
                                cnt2++;
                                if(k+1==board.length){
                                    board[k][j]=true;
                                }
                            }
                        }
                    }

                    board[i][j]=false;
                }
                drawArr(board);
                System.out.println(t+" cnt2 = "+cnt2);
            }

            sb.append(cnt+"\n");

            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    sb2.append((board[i][j]?1:0)+" ");
                }
                sb2.append("\n");
            }
            sb2.append("\n");
        }

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);
    }

    public static void drawArr(boolean board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print((board[i][j]?1:0)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
