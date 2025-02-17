import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Beakjoon2747 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        long nums[]= new long[n+1];

        System.out.println(fibo(n,nums));
    }

    public static long fibo(int n, long nums[]){

        if(n==0) return 0;
        else if(n<=2) return 1;
        else{
            if(nums[n]!=0){
                return nums[n];
            }
            else{
                nums[n]=(fibo(n-1,nums)+fibo(n-2,nums));
                return nums[n];
            }
        }
    }
}
