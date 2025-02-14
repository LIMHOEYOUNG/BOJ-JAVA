import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10798 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c[][]= new char[15][5];
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<5;i++){
            String s= br.readLine();
            for(int j=0;j<s.length();j++){
                char check= s.charAt(j);
                c[j][i]=check;
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(c[i][j]!='\u0000') sb.append(c[i][j]);
            }
        }

        System.out.println(sb);
    }
}
