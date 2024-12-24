import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4458 {
    public static void main(String[] agrs)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine();
            sb.append(str.substring(0,1).toUpperCase()+str.substring(1,str.length())+"\n");
        }

        System.out.println(sb);
    }
}
