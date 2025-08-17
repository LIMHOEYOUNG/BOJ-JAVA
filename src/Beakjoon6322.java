import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon6322 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        for(int i=1;;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0) break;
            char target= a==-1?'a':b==-1?'b':'c';
            double ans= 0.0;

            if(target=='a'){
                ans=Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
            }
            else if(target=='b'){
                ans=Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
            }
            else{
                ans=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
            }

            sb.append("Triangle #").append(i).append("\n");
            sb.append(Double.isNaN(ans)||ans==0.0?"Impossible.\n\n":String.format("%c = %.3f\n\n",target,ans));
        }

        System.out.print(sb);
    }
}
