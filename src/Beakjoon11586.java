import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11586 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String[] strs= new String[n];

        for(int i=0;i<n;i++){
            strs[i]= br.readLine();
        }
        int k= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        switch (k){
            case 1:
                for(int i=0;i<n;i++) sb.append(strs[i]).append("\n");
                break;
            case 2:
                for(int i=0;i<n;i++) sb.append(new StringBuilder(strs[i]).reverse()).append("\n");
                break;
            case 3:
                for(int i=n-1;i>=0;i--) sb.append(strs[i]).append("\n");
                break;

        }

        System.out.print(sb);
    }
}
/*
8
OOOOOOOO
OKKOOEEO
OKKOOEEO
OOOSSOOO
OOOSSOOO
OAOOOOAO
OOAAAAOO
OOOOOOOO
2
 */