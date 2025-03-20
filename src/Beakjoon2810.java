import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2810 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();
        int ans= 1;

        if(!str.contains("LL")) ans= n;
        else {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == 'S') ans++;
                else if (c == 'L') {
                    ans++;
                    i++;
                }
            }
        }

        System.out.println(ans);
    }
}
