import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon23841 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        char[][] board= new char[n][m];
        StringBuilder sb= new StringBuilder();
        boolean check= m%2!=0;
        int half_m= m/2+(check?1:0);

        for(int i=0;i<n;i++){
            String str= br.readLine();
            for(int j=0;j<m;j++){
                char c= str.charAt(j);
                if(c=='.'&&(board[i][j]=='\u0000')) board[i][j]=c;
                else if('A'<=c && c<='Z'){
                    board[i][j]=c;
                    if(j<half_m){
                        board[i][(m-1)-j]= c;
                    }
                    else{
                        board[i][half_m-(j-half_m)-(check?2:1)]=c;
                    }
                }
            }

            for(int j=0;j<m;j++) sb.append(board[i][j]);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}