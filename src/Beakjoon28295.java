import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon28295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int sum=0;
        for(int i=0;i<10;i++){
            sum+=Integer.parseInt(br.readLine());
        }

        if(sum%4==1){
            System.out.println("E");
        }
        else if(sum%4==2){
            System.out.println("S");
        }
        else if(sum%4==3){
            System.out.println("W");
        }
        else{
            System.out.println("N");
        }
    }
}
