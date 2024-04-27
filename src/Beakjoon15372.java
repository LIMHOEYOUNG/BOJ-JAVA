import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon15372 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int x= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<x;i++){
            sb.append((long)Math.pow(Integer.parseInt(br.readLine()),2)+"\n");
        }

        System.out.println(sb);
    }
}
