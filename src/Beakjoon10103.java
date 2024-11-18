import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int chang= 100;
        int sang= 100;
        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int c= Integer.parseInt(st.nextToken());
            int s= Integer.parseInt(st.nextToken());

            if(c>s) sang-=c;
            else if(c<s) chang-=s;

        }

        System.out.println(chang+"\n"+sang);
    }
}
