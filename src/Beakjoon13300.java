import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon13300 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stu[][]= new int[7][2];
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            int s= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            stu[y][s]++;
        }

        int ans= 0;
        for(int i=1;i<stu.length;i++){
            for(int j=0;j<stu[0].length;j++){
                ans+=(stu[i][j]/k+(stu[i][j]%k!=0?1:0));
            }
        }

        System.out.println(ans);
    }
}
