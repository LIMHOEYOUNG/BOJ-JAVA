import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon5533 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int game[][]= new int[3][101];
        //boolean game2[]= new boolean[101];
        //boolean game3[]= new boolean[101];

        int board[][]= new int[3][n];

        for(int i=0;i<board[0].length;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                board[j][i]= Integer.parseInt(st.nextToken());
                game[j][board[j][i]]+=1;
            }
        }

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<board[0].length;i++){
            int total= 0;
            for(int j=0;j<3;j++){
                if(game[j][board[j][i]]==1) total+=board[j][i];
            }

            sb.append(total+"\n");
        }

        System.out.println(sb);

    }
}
