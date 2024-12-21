import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= "UOS";
        int n;

        System.out.println(str.charAt((n= Integer.parseInt(br.readLine())%3)==0?2:n-1));
    }
}
