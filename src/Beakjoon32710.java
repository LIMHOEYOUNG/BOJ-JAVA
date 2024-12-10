import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32710 {
    public static int gugu(int n,int x){

        for(int i=x;i<10;i+=2){
            for(int j=1;j<10;j++){
                if(n==i || n==j || n==i*j){
                    return 1;
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        if(n%2==0){
            System.out.println(gugu(n,2));
        }

        else{
            System.out.println(gugu(n,3));
        }
    }
}
