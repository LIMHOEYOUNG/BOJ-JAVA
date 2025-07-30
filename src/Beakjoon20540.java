import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon20540 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c=='I') sb.append("E");
            else if(c=='E') sb.append("I");
            else if(c=='S') sb.append("N");
            else if(c=='N') sb.append("S");
            else if(c=='T') sb.append("F");
            else if(c=='F') sb.append("T");
            else if(c=='P') sb.append("J");
            else if(c=='J') sb.append("P");
        }

        System.out.println(sb);
    }
}
