import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4597 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb =new StringBuilder();
        String str;

        while(!(str=br.readLine()).equals("#")){
            int o= 0;
            int s_len= str.length();
            char c= str.charAt(s_len-1);
            sb.append(str.substring(0,s_len-1));

            for(int i=0;i<s_len;i++){
                if(str.charAt(i)=='1') o+=1;
            }

            sb.append(c=='o'?(o%2!=0?0:1):(o%2==0?0:1)).append("\n");
        }

        System.out.print(sb);
    }
}