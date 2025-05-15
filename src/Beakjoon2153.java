import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2153 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        char ch[]= br.readLine().toCharArray();
        int total= 0;

        for(char c: ch){
            if(Character.isUpperCase(c)){
                total+=(c-'A'+27);
            }
            else{
                total+=(c-'a'+1);
            }
        }

        boolean num[]= new boolean[total+1];
        prime_check(total,num);
        num[1]= false;

        if(num[total]) {
            System.out.println("It is not a prime word.");
            return;
        }

        System.out.println("It is a prime word.");

    }

    public static void prime_check(int n,boolean num[]){

        num[0]=num[1]= true;    //true == 소수아님

        if(n<2){
            return;
        }

        for(int i=0;i<=Math.sqrt(n);i++){
            if(num[i]) continue;
            for(int j=(int)Math.pow(i,2);j<num.length;j+=i){
                num[j]=true;
            }
        }

    }
}
