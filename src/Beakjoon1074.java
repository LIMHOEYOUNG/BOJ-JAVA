import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1074 {
    public static int ans= 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int n= (int)Math.pow(2,Integer.parseInt(st.nextToken()));
        int r= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());

        route(n,r,c);

        System.out.println(ans);
    }

    public static void route(int n, int r, int c){

        if(n==1){
            return;
        }

        if(r<n/2 && c<n/2){             //좌상
            route(n/2,r,c);
        }
        else if(r<n/2 && c>=n/2){       //우상
            ans+=(n*n/4);
            route(n/2,r,c-n/2);
        }
        else if(r>=n/2 && c<n/2){       //좌하
            ans+=(n*n/4)*2;
            route(n/2,r-n/2,c);
        }
        else{                           //우하
            ans+=(n*n/4)*3;
            route(n/2,r-n/2,c-n/2);
        }
    }
}
