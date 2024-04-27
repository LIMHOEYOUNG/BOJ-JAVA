import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2445 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        String star="*";
        String space= " ";

        for(int i=1;i<n+1;i++){
            sb.append(star.repeat(i)+space.repeat(2*(n-i))+star.repeat(i)+"\n");
        }
        for(int i=n-1;i>0;i--){
            sb.append(star.repeat(i)+space.repeat(2*(n-i))+star.repeat(i)+"\n");
        }

        System.out.println(sb);
    }
}
