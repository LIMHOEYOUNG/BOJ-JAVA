import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int color_blind= 0;
        int nomarl_person= 0;
        int image[][]= new int[n][n];
        boolean visit[][]= new boolean[n][n];


        for(int x=0;x<n;x++){
            String str= br.readLine();
            for(int y=0;y<n;y++){
                image[x][y]= str.charAt(y);
            }
        }


    }

    public void dfs(int x, int y){

    }
}