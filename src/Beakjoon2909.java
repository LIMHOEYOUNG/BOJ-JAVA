import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2909 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int cost= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        if(k==0) System.out.println(cost);
        else{
            int s= (int)Math.pow(10,k);
            int remain_s= (int)Math.pow(10,k-1);
            int front_cost= cost/s;
            int remain_cost= (cost%s);

            if(remain_cost/remain_s>4) front_cost+=1;

            System.out.println(front_cost*s);
        }
    }
}