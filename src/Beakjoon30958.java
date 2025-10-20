import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Beakjoon30958 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();
        int max_val= Integer.MIN_VALUE;
        int[] alpha= new int[26];


        for(int i=0;i<n;i++){
            char c= str.charAt(i);

            if('a'<=c && c<='z'){
                alpha[c-'a']++;
                max_val= Math.max(alpha[c-'a'],max_val);
            }
        }

        System.out.println(max_val);
    }
}
