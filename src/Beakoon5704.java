import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakoon5704 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        String str="";
        while(!(str=br.readLine()).equals("*")){
            boolean[] check= new boolean[27];
            int cnt= 0;
            for(int i=0;i<str.length();i++){
                char c= str.charAt(i);

                if(('a'<=c && c<='z')&&(!check[c-'a'])){
                    check[c-'a']=true;
                    cnt++;
                }
            }

            sb.append(cnt<26?"N":"Y").append("\n");
        }

        System.out.print(sb);
    }
}
