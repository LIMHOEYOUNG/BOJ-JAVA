import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2857 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        boolean check= false;
        for(int i=1;i<=5;i++){
            String str= br.readLine();

            if(str.contains("FBI")){
                check= true;
                sb.append(i+" ");
            }
        }

        if(check){
            System.out.println(sb);
        }
        else{
            System.out.println("HE GOT AWAY!");
        }
    }
}
