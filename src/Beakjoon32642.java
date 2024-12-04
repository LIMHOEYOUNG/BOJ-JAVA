import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32642 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        long ans= 0;
        long angry= 0;
        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            int check=  Integer.parseInt(st.nextToken());
            if(check==1){
                angry+=1;
            }
            else{
                angry-=1;
            }
            ans+=angry;
        }

        System.out.println(ans);

    }
}
