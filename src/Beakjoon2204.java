import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2204 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            int n= Integer.parseInt(br.readLine());
            if(n==0) break;

            String word= br.readLine();

            for(int i=0;i<n-1;i++){
                String str= br.readLine();
                word= word.compareToIgnoreCase(str)>=0?str:word;
            }

            sb.append(word+"\n");
        }
        System.out.print(sb);
    }
}