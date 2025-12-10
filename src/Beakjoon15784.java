import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15784 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        int[][] board= new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            st= new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                board[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        int standard= board[a][b];
        boolean check= true;

        for(int i=1;i<=n;i++){
            if(board[a][i]>standard){
                check= false;
                break;
            }
        }
        if(check){
            for(int i=1;i<=n;i++){
                if(board[i][b]>standard){
                    check= false;
                    break;
                }
            }
        }

        System.out.println(check?"HAPPY":"ANGRY");
    }
}
