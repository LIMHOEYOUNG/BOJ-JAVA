import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon14624 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        if(n%2==0) System.out.println("I LOVE CBNU");
        else{
            StringBuilder sb= new StringBuilder();

            for(int i=0;i<n;i++){
                sb.append("*");
            }
            sb.append("\n");

            int len= (n+1)/2;
            for(int i=len;i>0;i--){
                for(int j=1;j<=i;j++){
                    sb.append(j!=i?" ":"*");
                }

                int len2= 2*(len-i)-1;
                for(int j=0;j<=len2;j++){
                    sb.append(j!=len2?" ":"*");
                }

                sb.append("\n");
            }

            System.out.print(sb);
        }
    }
}
