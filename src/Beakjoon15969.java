import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon15969 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int nums[]=new int[n];

        StringTokenizer st= new StringTokenizer(br.readLine());

        int t= Integer.parseInt(st.nextToken());
        int max= t;
        int min= t;

        for(;st.hasMoreTokens();){
            t= Integer.parseInt(st.nextToken());

            if(t>max) max= t;
            else if(t<min) min= t;
        }

        //System.out.println(max+" "+min);
        System.out.println(max-min);
    }
}
