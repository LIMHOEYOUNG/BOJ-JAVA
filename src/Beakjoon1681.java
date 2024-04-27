import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1681 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String l = st.nextToken();

        int count=0;
        int answer=0;

        while (count!=n){
            answer++;
            if(!(Integer.toString(answer).contains(l))) count++;
        }
        System.out.println(answer);
    }
}
