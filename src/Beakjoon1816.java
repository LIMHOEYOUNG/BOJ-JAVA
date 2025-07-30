import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1816 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            long num= Long.parseLong(br.readLine());
            boolean check= false;

            for(long i=2;i<1000001;i++){
                if(num%i==0){
                    check= true;
                    break;
                }
            }

            sb.append(check?"NO":"YES").append("\n");
        }

        System.out.println(sb);
    }
}
/*
10
1000000000000000000
1000000000000000000
1000000000000000000
1000000000000000000
1000000000000000000
1000000000000000000
1000000000000000000
1000000000000000000
1000000000000000000
100000000000000002
 */