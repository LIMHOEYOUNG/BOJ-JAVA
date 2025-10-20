import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon34323 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        //long n= Long.parseLong(st.nextToken());
        //long m= Long.parseLong(st.nextToken());
        //long s= Long.parseLong(st.nextToken());

        double n= Double.parseDouble(st.nextToken());
        double m= Double.parseDouble(st.nextToken());
        int s= Integer.parseInt(st.nextToken());

        //double price1= (m+1)*s*(100-n)/100.0;
        double price1= ((m+1)*s)*(1-(n/100));
        double price2= m*s;

        System.out.println("price1 = "+price1+"\nprice2 = "+price2);
        //System.out.println("(long)price1 = "+(long)price1+"\n(long)price2 = "+(long)price2);

        //System.out.println(((m+1)*s));
        //System.out.println((1-(m/100)));
        //System.out.println(((m+1)*s)*(1-(n/100)));

        System.out.println(Math.min((long)price1,(long)price2));

        //if(price2>price1) System.out.println(price1);
        //else System.out.println(price2);



        for(double i=0;i<=100;i++){
            //System.out.println("(100-i)=>\t"+((100-i)/100));
            //System.out.println("1-i=>\t"+(1-i/100));

        }
    }
}
/*
0 100 100000000

10000000000
10000000000
 */