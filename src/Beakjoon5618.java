import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon5618 {
    public static StringBuilder sb= new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int num[]= new int[n];
        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        for(int i=1; i<= num[0];i++){
            boolean check= true;

            for(int a:num){
                if(a%i!=0){
                    check=false;
                    break;
                }
            }
            if(check){
                sb.append(i+"\n");
            }
        }

        System.out.print(sb);
    }
}