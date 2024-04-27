import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1789 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long s = Long.parseLong(br.readLine());

        long check=0;
        int count=0;
        for(int i=1;;i++){
            if(check>=s) break;
            check+=i;
            count++;
        }
        System.out.println(check==s?count:count-1);
    }
}
