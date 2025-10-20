import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15820 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder("Accepted");

        int s1= Integer.parseInt(st.nextToken());
        int s2= Integer.parseInt(st.nextToken());
        boolean check= true;

        while(s1-->0){
            st= new StringTokenizer(br.readLine());
            if(!st.nextToken().equals(st.nextToken())){
                sb.setLength(0);
                sb.append("Wrong Answer");
                check= false;
                break;
            }
        }

        if(check) {
            while (s2-- > 0) {
                st = new StringTokenizer(br.readLine());
                if(!st.nextToken().equals(st.nextToken())){
                    sb.setLength(0);
                    sb.append("Why Wrong!!!");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
