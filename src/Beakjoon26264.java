import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Beakjoon26264 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str =br.readLine();

        int b= 0;
        int s= 0;
        int str_len= str.length();

        for(int i=0;i<str_len;){
            if(str.charAt(i)=='s'){
                s+=1;
                i+=8;
            }
            else{
                b+=1;
                i+=7;
            }
        }

        System.out.println(s==b?"bigdata? security!":s>b?"security!":"bigdata?");
    }
}