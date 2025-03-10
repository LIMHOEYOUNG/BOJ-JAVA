import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2702 {
    public static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            //System.out.println("gcd = "+gcd(a,b));
            int gcd_value= gcd(a,b);
            sb.append(((a/gcd_value)*(b/gcd_value)*gcd_value)+" "+gcd_value+"\n");
        }


        System.out.println(sb);
    }

    public static int gcd(int a,int b){
        //유클리드 호제법
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }

    }
}
