import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3276 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int num[]= new int[2];
        int min= Integer.MAX_VALUE;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(n<=(i*j) && min>(i+j)){
                    min=(i+j);
                    num[0]=i;
                    num[1]=j;
                }
            }
        }

        System.out.println(num[0]+" "+num[1]);
    }
}