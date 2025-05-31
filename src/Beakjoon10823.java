import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon10823 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        BigInteger ans= new BigInteger("0");
        String str;

        while((str=br.readLine())!=null){
            sb.append(str);
        }


        String s= sb.toString();
        String num[]= s.split(",");

        long ans2= 0;
        for(int i=0;i<num.length;i++){
            //System.out.println(num[i]);
            ans2+= Long.parseLong(num[i]);
            ans= ans.add(new BigInteger(num[i]));
        }

        System.out.println(ans);
        //System.out.println(ans2);
    }
}
