import javax.swing.plaf.InsetsUIResource;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine(),"-");
        StringBuilder sb= new StringBuilder();

        while(st.hasMoreTokens()){
            sb.append(st.nextToken().charAt(0));
        }

        System.out.println(sb);

        /*
        //19532
        StringTokenizer st= new StringTokenizer(br.readLine());
        int nums[]= new int [7];    // 1,2,3 / 4,5,6

        for(int i=1;i<nums.length;i++){
            nums[i]= Integer.parseInt(st.nextToken());
        }
//노가다
        for(int x=-999; x<=999; x++){
            for(int y=-999; y<=999; y++){
                if(nums[1]*x + nums[2]*y == nums[3] && nums[4]*x + nums[5]*y == nums[6]){
                    System.out.println(x+" "+y);
                }
            }
        }

         */
        /*
        if(nums[1]*nums[4]<0){
            nums[1]=-nums[1];
            check1(nums);
        }
        else if(nums[1]*nums[4]>0){
            for(int i=5;i<nums.length;i++){
                nums[i]=-nums[i];
            }
            check1(nums);
        }
        else{
            check2(nums);
        }

         */
    }

    public static void check1(int nums[]){
        //System.out.println(Arrays.toString(nums));

        int y_value= (nums[4]*nums[2] + nums[1]*nums[5])==0?0:(nums[4]*nums[3] + nums[1]*nums[6])/(nums[4]*nums[2] + nums[1]*nums[5]);
        int x_value= (nums[3]-y_value*nums[2])/nums[1];
        /*
        System.out.println(nums[4]*nums[2]+"+"+nums[1]*nums[5]);
        System.out.println(nums[1]*nums[5]);
        System.out.println(nums[4]*nums[3]+"+"+nums[1]*nums[6]);
        System.out.println(nums[1]*nums[6]);

        System.out.println(nums[4]*nums[2] + nums[1]*nums[5]);
        System.out.println(nums[4]*nums[3] + nums[1]*nums[6]);
        System.out.println((nums[4]*nums[3] + nums[1]*nums[6])+"/"+(nums[4]*nums[2] + nums[1]*nums[5])+" = "+((nums[4]*nums[3] + nums[1]*nums[6])/(nums[4]*nums[2] + nums[1]*nums[5])));
        */
        System.out.print(x_value+" "+y_value);
    }

    public static void check2(int nums[]){
        int x_value= 0;
        int y_value= 0;
        if(nums[1]==0){ //x1=0
            y_value= nums[3]/nums[2];
            x_value= (nums[6]-nums[5]*y_value)/nums[4];
        }
        else if(nums[2]==0){ //y1=0
            x_value= nums[3]/nums[1];
            y_value= (nums[6]-nums[4]*x_value)/nums[5];
        }
        else if(nums[4]==0){    //x2=0
            y_value= nums[6]/nums[5];
            x_value= (nums[3]-nums[2]*y_value)/nums[1];
        }
        else{   //y2=0
            x_value= nums[6]/nums[4];
            y_value= (nums[3]-nums[1]*x_value)/nums[2];
        }

        System.out.println(x_value+" "+y_value);
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

-1 1 2 1 1 2
1 2 2 -1 2 2
0 1 1 2 3 5
1 1 5 3 1 11
1 -1 0 2 -2 0
-1 1 0 2 -2 0
1 -1 0 -2 2 0
-1 1 0 -2 2 0
0 1 1 2 0 2
0 1 1 1 2 5
1 0 1 1 2 5
1 2 5 0 1 1
1 2 5 1 0 1

 */