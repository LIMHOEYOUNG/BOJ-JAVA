import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Beakjoon21312 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        Random rd= new Random();

        if(rd.nextBoolean()) method1(st);
        else method2(st);
    }

    private static void method1(StringTokenizer st){
        int[] drink= new int[3];

        for(int i=0;i<3;i++){
            drink[i]= Integer.parseInt(st.nextToken());
        }

        int[] t= new int[7];
        Arrays.sort(drink);
        t[0]=drink[0];
        t[1]=drink[1];
        t[2]=drink[2];
        t[3]= drink[0]*drink[1];
        t[4]= drink[0]*drink[2];
        t[5]= drink[1]*drink[2];
        t[6]= drink[0]*drink[1]*drink[2];
        boolean check= true;
        int ans= 0;

        for(int i=6;i>=0;i--){
            if(t[i]%2!=0) {
                ans= t[i];
                check= false;
                break;
            }
        }

        System.out.println(check?t[6]:ans);
    }

    private static void method2(StringTokenizer st){
        int ans1= 1;
        int ans2= 1;
        boolean check= false;

        while(st.hasMoreTokens()){
            int drink= Integer.parseInt(st.nextToken());

            if(drink%2!=0){
                ans1*=drink;
                check= true;
            }
            ans2*=drink;
        }

        System.out.println(check?ans1:ans2);
    }

}
