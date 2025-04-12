import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10093 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        long a= Long.parseLong(st.nextToken());
        long b= Long.parseLong(st.nextToken());
        StringBuilder sb= new StringBuilder();
        long cnt= 0;

        for(long i= Math.min(a,b)+1;i<Math.max(a,b);i++){
            cnt++;
            sb.append(i);
            if (i+1!=Math.max(a,b)) sb.append(" ");
        }

        //System.out.println(cnt+(!sb.isEmpty()?("\n"+sb):"")); //java15 (CharSequence에서 상속받은 메서드)
        System.out.println(cnt+(!(sb.length()==0)?("\n"+sb):""));   //java8, java11
    }
}