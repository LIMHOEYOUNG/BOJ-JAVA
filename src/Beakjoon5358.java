import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5358 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= "";
        StringBuilder sb= new StringBuilder();
        while((str=br.readLine())!=null){
            for(int i=0;i<str.length();i++){
                char c= str.charAt(i);
                if(c=='e') sb.append("i");
                else if(c=='i') sb.append("e");
                else if(c=='E') sb.append("I");
                else if(c=='I') sb.append("E");
                else sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
