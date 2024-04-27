import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon1475 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(br.readLine());
        String str= br.readLine();
        int num[]= new int[9];
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if((c-'0')==9){
                num[6]++;
            }
            else {
                num[c - '0']++;
            }
        }
        int check= Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(i==6){
                int a=num[i]/2+(num[i]%2==0?0:1);
                if(check<a) check=a;
            }
            else {
                if (check < num[i]) {
                    check = num[i];
                }
            }
        }

        //System.out.println(Arrays.toString(num));
        System.out.println(check);
    }
}
/*
1000000
06094050


 */