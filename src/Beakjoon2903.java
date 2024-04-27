import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2903 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int x= Integer.parseInt(br.readLine());

        int answer= 2;

        for(int i=0;i<x;i++){
            answer+=Math.pow(2,i);
        }

        System.out.println((int)Math.pow(answer,2));
    }
}
