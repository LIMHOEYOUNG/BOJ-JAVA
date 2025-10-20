import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon14726 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            String str= br.readLine();
            int sum= 0;

            for(int i=0;i<str.length();i++){
                int c= str.charAt(i)-'0';

                if(i%2==0) c*=2;
                sum+=(c>=10?(c/10+c%10):c);

            }

            sb.append(sum%10!=0?"F":"T").append("\n");
        }

        System.out.print(sb);
    }
}
/*
1
7121111111111111

1
8571311111111111
 */