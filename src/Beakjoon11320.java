import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11320 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            //double ans= (Math.pow(a,2)/b)/b;

            int x= (a/b)+(a%b!=0?1:0);
            int tri= 1;
            int ans= 0;
            for(int i=0;i<x;i++){
                ans+=tri;
                tri+=2;
            }

            sb.append((int)ans).append("\n");
        }

        System.out.print(sb);
    }
}
