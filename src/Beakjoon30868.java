import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon30868 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        String bundleStr= "++++ ";
        String remainStr= "|";

        while(n-->0){
            int vote= Integer.parseInt(br.readLine());

            int bundle= vote/5;
            int remain= vote%5;
            if(bundle!=0){
                sb.append(bundleStr.repeat(bundle));
                sb.append(remainStr.repeat(remain));
            }
            else{
                sb.append(remainStr.repeat(remain));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
