import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11005 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        long n= Long.parseLong(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        StringBuilder sb= new StringBuilder();

        while(n!=0){
            long a= n%b;
            sb.append(a<10?(char)(a+'0'):(char)(a+55));

            n/=b;
        }

        System.out.println(sb.reverse());
    }
}

