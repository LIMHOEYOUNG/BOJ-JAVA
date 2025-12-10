import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Beakjoon3076 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] board= {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st= new StringTokenizer(br.readLine());
        int[] color_board= {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        Random rd= new Random();
        if(rd.nextBoolean()) method1(board,color_board);
        else method2(board,color_board);
    }

    private static void method1(int[] board, int[] color_board){
        StringBuilder shape1= new StringBuilder();
        StringBuilder shape2= new StringBuilder();
        StringBuilder ans= new StringBuilder();

        for(int i=0;i<board[1];i++){
            for(int j=0;j<color_board[1];j++){
                shape1.append(i%2==0?"X":".");
                shape2.append(i%2==1?"X":".");
            }
        }

        for(int i=0;i<board[0];i++){
            for(int j=0;j<color_board[0];j++){
                ans.append(i%2==0?shape1:shape2).append("\n");
            }
        }

        System.out.print(ans);
    }

    private static void method2(int[] board, int[] color_board){
        StringBuilder ans= new StringBuilder();
        Character[] ch= {'X','.'};
        int flag= 0;

        for(int n=0;n<board[0];n++){
            for(int c=0;c<color_board[0];c++){
                flag= 1&n;  //중복되는 열
                for(int m=0;m<board[1];m++){
                    for(int r=0;r<color_board[1];r++){
                        ans.append(ch[flag]);
                    }
                    flag^=1;  //0->1 1->0
                }
                ans.append("\n");
            }
        }

        System.out.print(ans);
    }
}