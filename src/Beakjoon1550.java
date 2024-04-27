import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1550 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        int answer=0;

//        for(int i=0;i<str.length();i++){
//            answer+=Integer.parseInt(str.charAt(i),16);
//        }
        System.out.println(Integer.parseInt(str,16));
    }
}
