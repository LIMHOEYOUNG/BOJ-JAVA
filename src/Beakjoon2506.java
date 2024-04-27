import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2506 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int answer=0;
        int count=0;
        int i=1;

        while(st.hasMoreTokens()){
            if(count==n) break;
            String ox=st.nextToken();
            if(ox.equals("1")) {
                answer+=i;
                i++;
                count++;
            }
            else if(ox.equals("0")){
                i=1;
                count++;
            }

        }
        System.out.println(answer);
    }
}
