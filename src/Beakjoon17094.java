import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Beakjoon17094 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int s_len= Integer.parseInt(br.readLine());
        String s= br.readLine();
        int e_cnt= 0;

        for(int i=0;i<s_len;i++){
            if(s.charAt(i)=='e') e_cnt++;
        }
        s_len-=e_cnt;

        System.out.println(s_len==e_cnt?"yee":e_cnt>s_len?"e":"2");
    }
}
