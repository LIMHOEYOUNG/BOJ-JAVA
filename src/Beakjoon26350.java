import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26350 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int d= Integer.parseInt(st.nextToken());
            int coins[]= new int[d];

            sb.append("Denominations:");
            for(int i=0;i<d;i++){
                coins[i]=Integer.parseInt(st.nextToken());
                sb.append(" "+coins[i]);
            }

            boolean flag= true;
            for(int i=1;i<d;i++){
                if(coins[i]<coins[i-1]*2) {
                    sb.append("\nBad coin denominations!\n\n");
                    flag=false;
                    break;
                }
            }

            if(flag){
                sb.append("\nGood coin denominations!\n\n");
            }
        }

        System.out.println(sb);
    }
}

/*
6
4 1 5 10 25
3 1 5 6
5 1 5 10 25 55
4 1 5 10 11
4 1 5 10 25
3 1 5 6


Denominations: 1 5 10 25
Good coin denominations!
Denominations: 1 5 10 25
Good coin denominations!

 */