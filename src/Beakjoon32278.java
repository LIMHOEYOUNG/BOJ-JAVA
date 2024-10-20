import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long num= Long.parseLong(br.readLine());

        if(-32768<=num && num<=32767){
            System.out.println("short");
        }
        else if(-2147483648<=num && num<=2147483647){
            System.out.println("int");
        }
        else{
            System.out.println("long long");
        }
    }
}
