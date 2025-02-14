import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon27240 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int s= Integer.parseInt(st.nextToken());
        int t= Integer.parseInt(st.nextToken());

        if(((a+1)<=s&&s<=(b-1))&&((a+1)<=t&&t<=(b-1))){
            System.out.println("City");
        }
        else{
            if(((1<=s&&s<=a)&&(1<=t&&t<=a))||((b<=s&&s<=n)&&(b<=t&&t<=n))){
                System.out.println("Outside");
            }
            else{
                System.out.println("Full");
            }
        }
    }
}
