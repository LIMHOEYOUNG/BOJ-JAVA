import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(n-->0){
            int num= Integer.parseInt(br.readLine());

            int maxNum= num;

            while(num!=1){
                if(num%2==0){
                    num/=2;
                }
                else{
                    num=3*num+1;
                    maxNum=Math.max(num,maxNum);
                }
            }

            sb.append(maxNum+"\n");
        }

        System.out.println(sb);
    }
}
