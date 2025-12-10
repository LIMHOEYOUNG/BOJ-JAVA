import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Beakjoon16466 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int[] nums= new int[n];

        for(int i=0;i<n;i++) {
            nums[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        if(nums[0]!=1) {
            System.out.println(1);
        }
        else {
            int ans= nums[n-1]+1;

            for(int i=1;i<n;i++) {
                if(nums[i-1]+1!=nums[i]) {
                    ans= nums[i-1]+1;
                    break;
                }
            }

            System.out.println(ans);
        }

    }
}
