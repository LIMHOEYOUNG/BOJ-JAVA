import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9455 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
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

            for(int i=board.length-2;i>=0;i--){
                for(int j=0;j<board[0].length;j++){
                    boolean check= false;
                    if(board[i][j]){
                        for(int k=i+1;k<board.length;k++){
                            if(board[k][j]) {
                                board[k-1][j]=true;
                                break;
                            }
                            else {
                                check=true;
                                cnt++;
                                if(k+1==board.length){
                                    board[k][j]=true;
                                }
                            }
                        }
                    }

                    board[i][j]=check?false:board[i][j];
                }
            }

            sb.append(cnt+"\n");
        }

        System.out.print(sb);
    }
}
