import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17293 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=n;i>0;i--){
            sb.append(i).append(" bottle").append(i==1?"":"s").append(" of beer on the wall, ").append(i).append(" bottle").append(i==1?"":"s").append(" of beer.\n").append("Take one down and pass it around, ").append((i-1==0?"no more":(i-1))).append(" bottle").append((i-1)==1?"":"s").append(" of beer on the wall.\n\n");
        }
        sb.append("No more bottles of beer on the wall, no more bottles of beer.\n").append("Go to the store and buy some more, ").append(n).append(" bottle").append(n==1?"":"s").append(" of beer on the wall.");

        System.out.println(sb);
    }
}
