import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon24365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int num[]=new int[3];
        for(int i=0;i<3;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        //System.out.println(Arrays.toString(num));
        /*
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
         */
        int avg= (num[0]+num[1]+num[2])/3;

        //2*(avg-Math.max(Math.max(a,b),c)) + ()

        System.out.println(2*(avg-num[0])+(avg-num[1]));
    }
}
