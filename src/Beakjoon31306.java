import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31306 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        int a=0;
        int b=0;

        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);

            switch (c){
                case 'a':
                    a+=1;
                    b+=1;
                    break;
                case 'e':
                    a+=1;
                    b+=1;
                    break;
                case 'i':
                    a+=1;
                    b+=1;
                    break;
                case 'o':
                    a+=1;
                    b+=1;
                    break;
                case 'u':
                    a+=1;
                    b+=1;
                    break;
                case 'y':
                    b+=1;
                    break;

            }
        }

        System.out.println(a+" "+b);
    }
}
