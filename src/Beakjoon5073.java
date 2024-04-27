import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5073 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());

            if(a==0&&b==0&&c==0) break;

            if(a==b&&b==c&&c==a) sb.append("Equilateral");
            else if(a!=b && b!=c && c!=a) {
                int max= Math.max(Math.max(a,b),c);
                if(a+b+c-max > max) {
                    sb.append("Scalene");
                }
                else sb.append("Invalid");
            }
            else{
                int max= Math.max(Math.max(a,b),c);
                if(a+b+c-max > max) {
                    sb.append("Isosceles");
                }
                else sb.append("Invalid");
            }


//            else if((a==b && b!=c)|| (a!=b && b==c)|| (a==c && b!=c)) sb.append("Isosceles");
//            else{
//                int max= Math.max(Math.max(a,b),c);
//                if(a+b+c-max>max) sb.append("Scalene");
//                else sb.append("Invalid");
//            }

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
