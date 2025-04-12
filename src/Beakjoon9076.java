import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon9076 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        String num_s[]= new String[5];
        int num[]= new int[5];

        while(n-->0){
            /*
            StringTokenizer st= new StringTokenizer(br.readLine());

            for(int i=0;i<num.length;i++){
                num[i]= Integer.parseInt(st.nextToken());
            }

             */
            num_s= br.readLine().split(" ");
            num= Arrays.stream(num_s).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(num);

            if(num[3]-num[1]>=4) sb.append("KIN\n");
            else sb.append((num[1]+num[2]+num[3])+"\n");
        }

        System.out.println(sb);
    }
}
