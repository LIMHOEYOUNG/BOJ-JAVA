import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15651 {
    private static StringBuilder sb= new StringBuilder();
    private static int n, m;
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        n= Integer.parseInt(st.nextToken());
        m= Integer.parseInt(st.nextToken());
        StringBuilder sb2= new StringBuilder();

        check(0,sb2);

        System.out.println(sb);
    }

    private static void check(int a, StringBuilder sb2){
        if(a==m){
            sb.append(sb2).append("\n");
        }
        else{
            for(int i=1;i<=n;i++){
                sb2.append(i).append(" ");
                check(a+1,sb2);
                if (sb2.length() >= 2) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
            }
        }
    }
}
