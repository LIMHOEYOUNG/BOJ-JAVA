import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32604 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int a= 0;
        int b= 0;

        boolean check= true;

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            if(i==0){
                a= Integer.parseInt(st.nextToken());
                b= Integer.parseInt(st.nextToken());
            }
            else{
                int checkA= Integer.parseInt(st.nextToken());
                int checkB= Integer.parseInt(st.nextToken());

                if(a>checkA || b>checkB){
                    check= false;
                    break;
                }
                else{
                    a=checkA;
                    b=checkB;
                }
            }
        }

        System.out.println(!check?"no":"yes");
    }
}
