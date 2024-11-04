import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        String jb= br.readLine();
        String jk= br.readLine();
        String eb= br.readLine();
        String ek= br.readLine();

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            if(jb.charAt(i)==eb.charAt(i)){
                if(jk.charAt(i)!=ek.charAt(i)){
                    System.out.println("htg!");
                    return;
                }
                else{
                    sb.append(jk.charAt(i));
                }
            }
        }

        System.out.println(sb);
    }
}
