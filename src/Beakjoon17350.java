import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17350 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        boolean check= false;

        while(n-->0){
            String str= br.readLine();

            if(str.equals("anj")){
                check=true;
                break;
            }
        }

        System.out.println(check?"뭐야;":"뭐야?");
    }
}
