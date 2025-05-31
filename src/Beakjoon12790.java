import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon12790 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        int value[]= new int[5];
        String v[]= new String[8];
        while(n-->0){
            //StringTokenizer st= new StringTokenizer(br.readLine());
            v= br.readLine().split(" ");
            /*
            for(int i=1;i<5;i++){
                value[i]= Integer.parseInt(st.nextToken());
            }
            for(int i=1;i<5;i++){
                value[i]+= Integer.parseInt(st.nextToken());
            }
             */
            for(int i=1;i<5;i++){
                value[i]= Integer.parseInt(v[i-1])+Integer.parseInt(v[(i-1)+4]);
            }

            if(value[1] < 1) {  //hp
                value[1] = 1;
            }
            if(value[2] < 1) {  //mp
                value[2] = 1;
            }
            if(value[3] < 0) {  //attack power
                value[3] = 0;
            }

            //1 * (HP) + 5 * (MP) + 2 * (공격력) + 2 * (방어력)
            sb.append(value[1]+ 5*value[2]+ 2*value[3]+ 2*value[4]+"\n");
        }

        System.out.print(sb);
    }
}
