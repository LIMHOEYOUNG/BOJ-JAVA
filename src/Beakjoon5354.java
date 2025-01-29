import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        String shap= "#";
        String jay= "J";

        while(n-->0){
            int len= Integer.parseInt(br.readLine());

            for(int i=0; i<len; i++){
                if(i==0 || i==len-1) sb.append(shap.repeat(len)+"\n");

                else{
                    sb.append(shap).append(jay.repeat(len-2)).append(shap+"\n");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
