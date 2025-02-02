import java.io.*;
import java.nio.file.FileSystem;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(n - 2024);
        /*
        int n= Integer.parseInt(br.readLine());

        int a=0, b=0;
        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int scoreA= Integer.parseInt(st.nextToken());
            int scoreB= Integer.parseInt(st.nextToken());

            if(scoreA>scoreB) a++;
            else if(scoreA<scoreB) b++;
        }

        System.out.println(a+" "+b);

    */
    }
}