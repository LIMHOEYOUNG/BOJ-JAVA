import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2966 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        char adrian[]= {'A','B','C'};                   //0 1 2
        char bruno[]= {'B', 'A', 'B', 'C'};             //0 1 2 3
        char goran[]= {'C', 'C', 'A', 'A', 'B', 'B'};   //0 1 2 3 4 5

        int ans_a= 0;
        int ans_b= 0;
        int ans_g= 0;

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        for(int i=0;i<n;i++){
            char c= str.charAt(i);
            if(adrian[i%3]==c) ans_a++;
            if(bruno[i%4]==c) ans_b++;
            if(goran[i%6]==c) ans_g++;
        }


        int max= Math.max(ans_a,Math.max(ans_b,ans_g));

        System.out.println(max);
        if(ans_a==max) System.out.println("Adrian");
        if(ans_b==max) System.out.println("Bruno");
        if(ans_g==max) System.out.println("Goran");
    }
}
