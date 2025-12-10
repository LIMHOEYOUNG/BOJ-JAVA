import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16769 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int[][] milk= new int[3][2];

        for(int i=0;i<3;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            milk[i][0]= Integer.parseInt(st.nextToken());
            milk[i][1]= Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<4;i++){
            int a= i%3;
            int b= (i+1)%3;

            int f_milk_vol= milk[a][1];
            int s_bottle_vol= milk[b][0];
            int s_milk_vol= milk[b][1];
            int move_milk= s_bottle_vol>=s_milk_vol+f_milk_vol?f_milk_vol : (s_bottle_vol-s_milk_vol);

            milk[a][1]= f_milk_vol-move_milk;
            milk[b][1]= s_milk_vol+move_milk;
        }

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<3;i++){
            sb.append(milk[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}