import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon27541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();
        StringBuilder sb = new StringBuilder();

        if(str.charAt(str.length()-1)=='G'){
            for(int i=0;i<str.length()-1;i++){
                sb.append(str.charAt(i));
            }
        }
        else{
            sb.append(str+"G");
        }

        System.out.println(sb);
    }
}
