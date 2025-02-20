import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11655 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);

            if(65<=c&&c<=90){   //대문자
                convert(sb,c,65,90);
            }
            else if(97<=c&&c<=122){ //소문자
                convert(sb,c,97,122);
            }
            else sb.append(c);

        }

        System.out.println(sb);
    }

    public static void convert(StringBuilder sb, char c, int s, int f){
        if(c+13>f){
            sb.append((char)((s-1)+((c+13)-f)));
        }
        else{
            sb.append((char)(c+13));
        }
    }
}
