import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3985 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int l= Integer.parseInt(br.readLine());
        int n= Integer.parseInt(br.readLine());
        int cake[]= new int[l+1];

        int ans1[]= new int[2];
        int ans2[]= new int[2];
        for(int i=1;i<=n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int p= Integer.parseInt(st.nextToken());
            int k= Integer.parseInt(st.nextToken());
            int wantCake= 0;
            int realCake= 0;

            for(int j=p;j<=k;j++){
                if(cake[j]==0){
                    wantCake++;
                    realCake++;
                    cake[j]=1;
                }
                else{
                    wantCake++;
                }
            }

            if(ans1[1]<wantCake){
                ans1[0]= i;
                ans1[1]= wantCake;
            }
            if(ans2[1]<realCake){
                ans2[0]= i;
                ans2[1]= realCake;
            }
        }

        System.out.print(ans1[0]+"\n"+ans2[0]);
    }
}
