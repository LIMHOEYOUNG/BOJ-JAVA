import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Beakjoon3778 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        ArrayList<Character> alpha = new ArrayList<Character>();
        int count=1;
        for(int i=0;i<n;i++){
            int check=0;
            String str1= br.readLine();
            String str2= br.readLine();
            if(str1.length()==0 || str2.length()==0){
                sb.append("Case #"+count+": "+(Math.max(str1.length(),str2.length()))+"\n");
                count++;
                continue;
            }

            String str_long= str1.length()>=str2.length()?str1:str2;
            String str_short= str_long.equals(str1)?str2:str1;
            for(int j=0;j<str_long.length();j++){
                alpha.add(str_long.charAt(j));
            }
            for(int j=0;j<str_short.length();j++){
                char c= str_short.charAt(j);
                if(alpha.contains(c)){
                    check++;
                    alpha.remove(alpha.indexOf(c));
                }
            }
            sb.append("Case #"+count+": "+(str_long.length()+str_short.length()-2*check)+"\n");
            count++;
            alpha.clear();
        }
        System.out.println(sb);
    }
}