import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2954 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String check="aeiou";
        String str[] = br.readLine().split(" ");
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length;i++){
            String s= str[i];

            for(int j=0;j<s.length();){
                String c= s.substring(j,j+1);
                if(check.contains(c)) {
                    sb.append(c);
                    j+=3;
                }
                else{
                    sb.append(c);
                    j++;
                }
            }

            if(i!=str.length-1) sb.append(" ");
        }

        System.out.print(sb);
    }
}
