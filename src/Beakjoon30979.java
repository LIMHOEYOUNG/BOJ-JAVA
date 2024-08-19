import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        int n= Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());

        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=Integer.parseInt(st.nextToken());
        }

        if(cnt>=t){
            System.out.println("Padaeng_i Happy");
        }
        else{
            System.out.println("Padaeng_i Cry");
        }
    }
}
