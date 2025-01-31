import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=1;i<=n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());

            int nums[]= {a,b,c};
            Arrays.sort(nums);
            if(nums[0]+nums[1]<=nums[2]) sb.append(String.format("Case #%d: invalid!\n",i));
            else if(nums[0]==nums[1] && nums[1]==nums[2]) sb.append(String.format("Case #%d: equilateral\n",i));
            else if(nums[0]==nums[1] || nums[1]==nums[2]) sb.append(String.format("Case #%d: isosceles\n",i));
            else sb.append(String.format("Case #%d: scalene\n",i));
        }

        System.out.println(sb);
    }
}