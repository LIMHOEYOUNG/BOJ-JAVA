import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        int even=0;
        int odd=0;

        for(int i=0;i<n;i++){
            if((int)(str.charAt(i))%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println(even==odd?-1:even>odd?0:1);
    }
}
