import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon13304 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int[][] stu= new int[7][2];

        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            int s= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            stu[y][s]++;
        }

        int ans= ((stu[1][0]+stu[2][0]+stu[1][1]+stu[2][1])/k)+
                ((stu[1][0]+stu[2][0]+stu[1][1]+stu[2][1])%k==0?0:1);

        for(int i=3;i<stu.length;i+=2){
            ans+=((stu[i][0]+stu[i+1][0])/k)+((stu[i][0]+stu[i+1][0])%k!=0?1:0);
            ans+=((stu[i][1]+stu[i+1][1])/k)+((stu[i][1]+stu[i+1][1])%k!=0?1:0);
        }

        System.out.println(ans);
    }
}
