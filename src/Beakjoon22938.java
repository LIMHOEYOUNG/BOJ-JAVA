import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon22938 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st= new StringTokenizer(br.readLine());

        double[] num= new double[6];
        boolean check= true;

        for(int i=0;i<6;i++){
            num[i]= Double.parseDouble(st.nextToken());
            if(i==2) st= new StringTokenizer(br.readLine());
        }

        double d= Math.sqrt(Math.pow((num[0]-num[3]),2)+Math.pow((num[1]-num[4]),2));
        //System.out.println("d = "+d+" r1+r2 = "+(num[2]+num[5]));
        if(d>=(num[2]+num[5])){
            check= false;
        }

        System.out.println(check?"YES":"NO");
    }
}
/*
-1000000000 -1000000000 1000000000
1000000000 1000000000 1000000000

-1000000000 -1000000000 0
-1000000000 -1000000000 0
1 1 5
-1 -1 3

-707106780 -707106780 1000000000
707106780 707106780 1000000000

-2 -2 2
2 2 2

0 0 2
4 0 2

0 0 2
4 0 3

0 0 2
4 0 1

0 0 2
0 0 1

0 2 2
0 1 1

0 3 3
0 2 1
 */