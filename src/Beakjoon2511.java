import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2511 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer a= new StringTokenizer(br.readLine());
        StringTokenizer b= new StringTokenizer(br.readLine());

        int aScore= 0;
        int bScore= 0;
        String lastWin= "D";
        while(a.hasMoreTokens()){
            int aPoint= Integer.parseInt(a.nextToken());
            int bPoint= Integer.parseInt(b.nextToken());

            if(aPoint>bPoint) {
                aScore+=3;
                lastWin="A";
            }
            else if(aPoint==bPoint) {
                aScore+=1;
                bScore+=1;
            }
            else {
                bScore+=3;
                lastWin="B";
            }
        }

        System.out.println(aScore+" "+bScore);
        System.out.print(aScore>bScore?"A":aScore==bScore?lastWin:"B");
    }
}
