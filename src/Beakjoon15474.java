import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15474 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());

        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int d= Integer.parseInt(st.nextToken());

        int check1= 0;
        int check2= 0;

        if(n%a==0){
            check1= (n/a)*b;
        }
        else{
            check1= ((n/a)+1)*b;
        }

        if(n%c==0){
            check2= (n/c)*d;
        }
        else{
            check2= ((n/c)+1)*d;
        }

        System.out.println(Math.min(check1,check2));
    }
}
