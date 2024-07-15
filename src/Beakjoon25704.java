import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon25704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        double cost= Double.parseDouble(br.readLine());


        if(5<=n && n<10) cost-=500;
        else if(10<=n && n<15) cost=Math.min(cost-500,(cost*0.9));
        else if(15<=n && n<20) cost=Math.min((cost*0.9),cost-2000);
        else if(20<=n) cost=Math.min(cost-2000,(cost*0.75));

        System.out.println(cost<0?0:(int)cost);
    }
}
