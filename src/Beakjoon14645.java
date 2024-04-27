import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14645 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int x= Integer.parseInt(st.nextToken());
        while(x-->0){
           st= new StringTokenizer(br.readLine());
        }
        System.out.println("비와이");
    }
}
