import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon23235 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int count=1;
        while(true){
            String str= br.readLine();

            if(str.equals("0")) break;

            sb.append("Case "+count+": Sorting... done!\n");
            count++;
        }

        System.out.println(sb);
    }
}
