import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon27961 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long n= Long.parseLong(br.readLine());

        if(n==0){
            System.out.println(0);
        }
        else{
            long num= 1;
            int cnt= 1;
            while(num<n){
                num*=2;
                cnt++;
            }
            System.out.println(cnt);
        }

        //System.out.println(n==0?0:((long) Math.ceil(Math.log(n) / Math.log(2))+1));

    }
}
/*
문제를 잘 읽어보면
복제 마법은 0마리부터 현재 보유한 마릿 수만큼 더할수있다.
그렇다는건 처음 0마리일때 수행하는 생성마법을 제외하면 더 이상의 생성마법은 불필요하다는 거다
그렇기에 반복문을 사용해서 cnt를 구한다
log함수를 사용하여 제출해 보았는데 부동소수점으로 인해 오답이 처리가 되는 듯 하다.
 */