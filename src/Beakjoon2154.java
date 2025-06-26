import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2154 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        String n_str= Integer.toString(n);
        //int n_len= Integer.toString(n).length();

        for(int i=1;i<=n;i++){
            sb.append(i);
            //15System.out.println(sb.length()>=n_len?sb.toString().substring(sb.length()-n_len,sb.length()):"less");
            //if(sb.length()>=n_len && sb.substring(sb.length()-n_len,sb.length()).equals(n_str)) break;
        }

        System.out.println(sb.indexOf(n_str)+1);
    }
}
/*
100000
 */