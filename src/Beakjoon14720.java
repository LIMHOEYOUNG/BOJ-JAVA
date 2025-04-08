import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14720 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int ans= 0;
        boolean start= true;
        int before_milk= -1;

        for(int i=0;i<n;i++){
            int milk= Integer.parseInt(st.nextToken());

            if(start && milk==0){
                ans++;
                before_milk= 0;
                start= false;
            }

            else if(!start){
                if((before_milk+1) == milk){
                    ans++;
                    before_milk= (((before_milk+1)%2)==0 && milk==2)?-1:(before_milk+1)%2;
                }
            }
        }

        System.out.println(ans);
    }
}
/*
5
1 1 0 2 1
 */