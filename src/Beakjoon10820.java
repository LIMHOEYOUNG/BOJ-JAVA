import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10820 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        String str;

        while((str= br.readLine())!=null){
            int upper= 0;
            int lower= 0;
            int num= 0;
            int blank= 0;

            for(int j=0;j<str.length();j++){
                char c= str.charAt(j);

                if('A'<=c && c<='Z') upper++;
                else if('a'<=c && c<='z') lower++;
                else if('0'<=c && c<='9') num++;
                else if(c==' ') blank++;
            }

            sb.append(lower+" "+upper+" "+num+" "+blank+"\n");
        }

        System.out.println(sb);
    }
}
