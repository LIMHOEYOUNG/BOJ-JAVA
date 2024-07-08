import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon29766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        String dksh="DKSH";

        int ans=str.replace(dksh,"").length();

        // 전체길이 - dksh제외한 길이
        System.out.println((str.length()-ans)/dksh.length());
    }
}
