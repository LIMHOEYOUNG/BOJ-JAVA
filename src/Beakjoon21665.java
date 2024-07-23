import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon21665 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        char standard[][]=new char[n][m];

        for(int i=0;i<n;i++){
            standard[i]= br.readLine().toCharArray();
        }

        int ans=0;
        br.readLine();

        for(int i=0;i<n;i++){
            String str= br.readLine();
            for(int j=0;j<m;j++){
                if(standard[i][j]==str.charAt(j)) ans++;
            }
        }

        System.out.println(ans);
    }
}
