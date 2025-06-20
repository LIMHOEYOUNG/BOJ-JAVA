import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1855 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        char alpha[][]= new char[str.length()/n][n];
        char board[]= new char[str.length()];

        StringBuilder sb= new StringBuilder();

        int index= 0;
        //좌-->우 우-->좌 좌-->우 우--->좌
        for(int i=0;i<str.length();i++){
            if((i/n)%2==0){
                alpha[i/n][index]=str.charAt(i);
                board[n*(i/n)+index]= str.charAt(i);
                index++;
            }
            else{
                index--;
                alpha[i/n][index]=str.charAt(i);
                board[(n*(i/n)+1)-index+1]= str.charAt(i);
            }
            drawArr(alpha);
            drawArr(board);
        }

        for(int i=0;i<alpha[0].length;i++){
            for(int j=0;j<alpha.length;j++){
                sb.append(alpha[j][i]);
            }
        }

        System.out.println(sb);
    }

    private static void drawArr(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drawArr(char[] board){
        for(int i=0;i<board.length;i++){
            System.out.print(board[i]);
        }
        System.out.println();
    }
}
/*
2
as
db
gn
al
ew
ji
as
df
kl
as
dv

2
as
db
gn
al
ew
ji
as
df
kl
as
dv

abgleiafksdsdnawjsdlav
abgleiafksdsdnawjsdlav
 */