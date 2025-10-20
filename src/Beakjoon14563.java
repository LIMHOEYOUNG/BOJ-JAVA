import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14563 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            int num= Integer.parseInt(st.nextToken());
            calc(num,sb);
        }

        System.out.print(sb);
    }

    private static void calc(int n, StringBuilder sb){
        if(n==1) {
            sb.append("Deficient").append("\n");
            return;
        }

        int sum_value= 1;
        boolean[] check= new boolean[n+1];
        for(int i=2;i<n;i++){
            if(check[i]) break;
            if(n%i==0){
                int n1= n/i;

                if(n1!=i){
                    sum_value+=(n1+i);
                    //System.out.print(i+" "+n1+" ");
                    check[i]= true;
                    check[n1]= true;
                }
                else{
                    sum_value+=i;
                }
            }
        }

        //System.out.println("sum_value = "+sum_value+", n = "+n);

        if(sum_value==n) sb.append("Perfect");
        else if(sum_value>n) sb.append("Abundant");
        else sb.append("Deficient");
        sb.append("\n");
    }
}
