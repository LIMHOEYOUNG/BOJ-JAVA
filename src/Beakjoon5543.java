import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5543 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int buger[] =new int[3];
        for(int i=0;i<3;i++){
            buger[i]=Integer.parseInt(br.readLine());
        }

        int setCost = Integer.MAX_VALUE;
        for(int i=0;i<2;i++){
            int drink= Integer.parseInt(br.readLine());
            for(int j=0;j<3;j++){
                int cal = drink+buger[j];
                if(setCost>cal) setCost= cal;
            }
        }
        System.out.println(setCost-50);
    }
}
