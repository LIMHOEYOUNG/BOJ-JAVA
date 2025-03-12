import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon14696 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        //별(4), 원(3), 네(2), 세(1)

        StringBuilder sb= new StringBuilder();

        while(n-->0){

            int player1[]= new int[5];
            int player2[]= new int[5];

            //System.out.println(Arrays.toString(player1));
            //System.out.println(Arrays.toString(player2));

            for(int i=0;i<2;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                int a= Integer.parseInt(st.nextToken());
                for(int j=0;j<a;j++){
                    if(i==0) player1[Integer.parseInt(st.nextToken())]++;
                    else player2[Integer.parseInt(st.nextToken())]++;
                }
            }

            for(int i=4;i>=1;i--){
                if(player1[i]>player2[i]) {
                    sb.append("A\n");
                    break;
                }
                else if(player1[i]<player2[i]) {
                    sb.append("B\n");
                    break;
                }

                if((player1[i]==player2[i])&&i==1) sb.append("D\n");
            }

            //System.out.println(sb);
        }

        System.out.println(sb);
    }
}
