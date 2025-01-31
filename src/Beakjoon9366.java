import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon9366 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=1;i<=n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int nums[]= {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            Arrays.sort(nums);

            if(nums[0]+nums[1]<=nums[2]) sb.append(String.format("Case #%d: invalid!\n",i));
            else if(nums[0]==nums[1] && nums[1]==nums[2]) sb.append(String.format("Case #%d: equilateral\n",i));
            else if(nums[0]==nums[1] || nums[1]==nums[2]) sb.append(String.format("Case #%d: isosceles\n",i));
            else sb.append(String.format("Case #%d: scalene\n",i));
        }

        System.out.println(sb);
    }
}
