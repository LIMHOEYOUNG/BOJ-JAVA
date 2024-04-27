import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4892 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a;
        int i= 1;
        String str= "";

        while(true) {
            a = Integer.parseInt(br.readLine());
            if(a==0) break;

            if(a%2==0) str = "even";
            else {
                str = "odd";
                a--;
            }
            a/=2;

            sb.append(i+". "+str+" "+a+"\n");
            i++;
        }

        System.out.print(sb);
    }
}
