import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17618 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int number= Integer.parseInt(br.readLine());

        int ans= 0;
        for(int i=1;i<=number;i++){
            int num= i;
            int n= 0;
            while((num/10)!=0){
                n+= num%10;
                //System.out.println(n+" "+(n%10));
                //System.out.println((num/10)+" "+(num%10));
                num=num/10;
            }
            n+= num;
            //System.out.println(i+" => "+n);
            if(i%n==0) {
                //System.out.println(i);
                ans++;
            }
        }

        System.out.println(ans);

    }
}
