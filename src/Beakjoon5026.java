import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5026 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            String str= br.readLine();

            if(str.equals("P=NP")){
                sb.append("skipped\n");
            }
            else{
                String[] num= str.split("\\+");
                sb.append((Integer.parseInt(num[0])+Integer.parseInt(num[1]))).append("\n");
            }
        }

        System.out.print(sb);
    }
}
