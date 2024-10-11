import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31616 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();
        char c= str.charAt(0);

        for(int i=1;i<n;i++){
            char c2= str.charAt(i);

            if(c!=c2) {
                System.out.println("No");
                return;
            }

            c=c2;
        }

        System.out.println("Yes");
    }
}
