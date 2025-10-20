import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon23348 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] lev= new int[3];
        for(int i=0;i<3;i++){
            lev[i]= Integer.parseInt(st.nextToken());
        }
        int n= Integer.parseInt(br.readLine());
        int[] team= new int[n+1];
        int max_score= 0;

        for(int i=1;i<=n;i++){
            for(int j=0;j<3;j++){
                st= new StringTokenizer(br.readLine());
                for(int k=0;k<3;k++){
                    team[i]+=lev[k]*Integer.parseInt(st.nextToken());
                }
            }

            max_score= Math.max(max_score,team[i]);
        }

        System.out.println(max_score);
    }
}