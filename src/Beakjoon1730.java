import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon1730 {
    //public static int x= 0;
    //public static int y= 0;

    public static void main(String[] args)throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str= br.readLine();

        boolean check[][]=new boolean[n][n];
        char trace[][]= new char[n][n];
        for(int i=0;i<n;i++) {
            Arrays.fill(trace[i], '.');
        }
        int x=0, y=0;
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            switch (c){

                case 'U':
                    x--;
                    if(move_order(n,x,y,check,trace,'|',c)){
                        x++;
                    }
                    break;
                case 'D':
                    x++;
                    if(move_order(n,x,y,check,trace,'|',c)){
                        x--;
                    }
                    break;
                case 'L':
                    y--;
                    if(move_order(n,x,y,check,trace,'-',c)){
                        y++;
                    }
                    break;
                case 'R':
                    y++;
                    if(move_order(n,x,y,check,trace,'-',c)){
                        y--;
                    }
                    break;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(trace[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean move_order(int n, int x, int y, boolean[][] check, char[][] trace, char pattern, char order){

        if((0<=x&&x<n)&&(0<=y&&y<n)){
            //System.out.println("\nx = "+x+" y = "+y);
            if(!check[0][0]){
                check[0][0]=true;
                trace[0][0]=pattern;
            }
            int before_x= x;
            int before_y= y;
            if(order=='U') before_x=x+1;
            else if(order=='D') before_x=x-1;
            else if(order=='L') before_y=y+1;
            else if(order=='R') before_y=y-1;


            if(check[x][y]&&trace[x][y]!=pattern) trace[x][y]='+';
            else if((!check[x][y])&&trace[x][y]=='.') {
                check[x][y]=true;
                trace[x][y]=pattern;
            }

            //System.out.println("order = "+order+" before_x = "+before_x+" before_y = "+before_y);
            //System.out.println("before = "+trace[before_x][before_y]+" pattern = "+pattern);
            if((trace[before_x][before_y]!=pattern)&&trace[before_x][before_y]!='.') trace[before_x][before_y]='+';

            return false;
        }
        else return true;
    }
}
