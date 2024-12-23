import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon24084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String s= br.readLine();

        StringBuilder sb= new StringBuilder();
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='J') sb.append(s.charAt(i-1)+"\n");
        }

        System.out.println(sb);
    }
}
