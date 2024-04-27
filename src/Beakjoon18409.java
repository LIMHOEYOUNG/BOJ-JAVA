import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon18409 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int x= Integer.parseInt(br.readLine());
        String str= br.readLine();

        int count=0;
        for(int i=0;i<x;i++){
            char c= str.charAt(i);
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u') count++;
        }

        System.out.println(count);
    }
}
