import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5013 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        int loss=0;
        for(int i=0;i<n;i++){
            String str= br.readLine();
            if(str.contains("CD")) loss++;
        }

        System.out.println(n-loss);
    }
}
