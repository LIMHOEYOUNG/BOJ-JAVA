import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon8949 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int num1= Integer.parseInt(st.nextToken());
        int num2= Integer.parseInt(st.nextToken());
        StringBuilder sb= new StringBuilder();

        int max_int_len= Integer.toString(Math.max(num1,num2)).length();
        for(int i=0;i<max_int_len;i++){
            int n1= num1%10;
            int n2= num2%10;

            //System.out.println("i = "+i);
            //System.out.println("n=> "+n1+" "+n2);
            sb.insert(0,(n1+n2));
            num1/=10;
            num2/=10;
            //System.out.println("num=> "+num1+" "+num2);
        }

        System.out.println(sb);
    }
}
