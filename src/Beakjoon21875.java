import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon21875 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String a= br.readLine();
        String b= br.readLine();

        int x= 0;
        int y= 0;

        for(int i=0;i<2;i++){
            int mv= Math.abs((a.charAt(i)-b.charAt(i)));

            if(y< mv){
                x= y;
                y= mv;
            }
            else{
                x= mv;
            }
        }

        System.out.println(x+" "+y);
    }
}
