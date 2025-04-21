import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11944 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int num= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<num;i++){
            if(sb.length()>=n){
                break;
            }

            sb.append(num);
        }

        System.out.println(sb.length()>n?sb.substring(0,n):sb);
    }
}
/*

 */