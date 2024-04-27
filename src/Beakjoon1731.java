import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Beakjoon1731 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int num[]= new int[51];
        for(int i=0;i<n;i++){
            num[i]= Integer.parseInt(br.readLine());
        }
        if((num[1]-num[0])==(num[2]-num[1])){
            System.out.println(num[n-1]+(num[1]-num[0]));
        }
        else{
            System.out.println(num[n-1]*(num[1]/num[0]));
        }
    }
}
