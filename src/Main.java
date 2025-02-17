import javax.swing.plaf.InsetsUIResource;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int nums[]= new int [7];    // 1,2,3 / 4,5,6

        for(int i=1;i<nums.length;i++){
            nums[i]= Integer.parseInt(st.nextToken());
        }

        int x_value= 0;
        int y_value= 0;

        if(nums[1]*nums[4]<0){
            check1(nums);
        }
        else{
            for(int i=5;i<nums.length;i++){
                nums[i]=-nums[i];
            }
            check1(nums);
        }

        //System.out.print(x_value+" "+y_value);
    }

    public static void check1(int nums[]){
        System.out.println(Arrays.toString(nums));

        int y_value= (nums[4]*nums[3] + nums[1]*nums[6])/(nums[4]*nums[2] + nums[1]*nums[5]);
        int x_value= (nums[3]-y_value*nums[2])/nums[1];
        //System.out.println(nums[4]*nums[2]+"+"+nums[1]*nums[5]);
        //System.out.println(nums[1]*nums[5]);
        //System.out.println(nums[4]*nums[3]+"+"+nums[1]*nums[6]);
        //System.out.println(nums[1]*nums[6]);

        //System.out.println(nums[4]*nums[2] + nums[1]*nums[5]);
        //System.out.println(nums[4]*nums[3] + nums[1]*nums[6]);
        //System.out.println((nums[4]*nums[3] + nums[1]*nums[6])+"/"+(nums[4]*nums[2] + nums[1]*nums[5])+" = "+((nums[4]*nums[3] + nums[1]*nums[6])/(nums[4]*nums[2] + nums[1]*nums[5])));

        System.out.print(x_value+" "+y_value);
    }
}
/*
501

990
500 -> 1
100 -> 4
50 -> 1
10 -> 4
5 -> 1550
1 -> 4
 */