import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon20001 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int problem= 0;
        while(true){
            String str= br.readLine();

            problem= problem+(str.equals("문제")?1:(str.equals("고무오리")&&problem==0)?2:(str.equals("고무오리")?-1:0));
            if(str.equals("고무오리 디버깅 끝")) break;
        }

        System.out.println(problem==0?"고무오리야 사랑해":"힝구");
    }
}
