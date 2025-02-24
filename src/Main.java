import java.io.*;
import java.util.*;

public class Main {
    public static int dx[]={-1,1,0,0};
    public static int dy[]={-1,1,0,0};
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        int box[][]= new int[n][m];

        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());

            for(int j=0;j<m;j++){
                box[i][j]= Integer.parseInt(st.nextToken());
                if(box[i][j]==1);
            }
        }
    }
}