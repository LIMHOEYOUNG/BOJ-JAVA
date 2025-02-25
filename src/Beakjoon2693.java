import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2693 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //2693
        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        int num[]= new int[10];

        for(int i=0;i<n;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());

            for(int j=0;j<num.length;j++){
                num[j]= Integer.parseInt(st.nextToken());
            }
            Arrays.sort(num);

            sb.append(num[7]+"\n");
        }

        System.out.println(sb);
    }
}
