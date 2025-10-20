import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4592 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        String str= "";

        while(!(str=br.readLine()).equals("0")){
            StringTokenizer st= new StringTokenizer(str);
            //boolean[] nums= new boolean[100];
            int before_num= 0;

            int n= Integer.parseInt(st.nextToken());
            for(int i=0;i<n;i++){
                int num= Integer.parseInt(st.nextToken());
                if(num!= before_num){
                    sb.append(num).append(" ");
                    before_num= num;
                }
            }

            sb.append("$\n");
        }

        System.out.print(sb);
    }
}
