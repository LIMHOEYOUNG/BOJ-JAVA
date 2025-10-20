import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10874 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        int[] answer_sheet= new int[11];
        int stu= 1;

        for(int i=1;i<11;i++){
            answer_sheet[i]= ((i-1)%5)+1;
        }

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            boolean check= true;

            // ((j-1) mod 5) +1
            for(int i=1;i<11;i++){
                int submit_anser= Integer.parseInt(st.nextToken());
                if(submit_anser!=answer_sheet[i]){
                    check= false;
                    break;
                }
            }

            if(check) sb.append(stu).append("\n");

            stu++;
        }

        System.out.print(sb);
    }
}
