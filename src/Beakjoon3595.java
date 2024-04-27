import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3595 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int minArea= Integer.MAX_VALUE;
        int a=0,b=0,c=0;
        for(int x=1;x<=n;x++){
            if(n%x==0){
                int remain= n/x;
                for(int y=1; y<=n; y++){
                    if(remain%y==0){
                        int z= remain/y;

                        int surfaceArea= (x*y + y*z + z*x)*2;
                        if(surfaceArea < minArea){
                            a=x;
                            b=y;
                            c=z;
                            minArea=surfaceArea;
                            //System.out.println(a+" "+b+" "+c+" => "+surfaceArea);
                        }
                    }
                }
            }
        }
        System.out.println(a+" "+b+" "+c+" ");
    }
}
