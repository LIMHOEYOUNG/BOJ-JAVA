import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon9095 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        int num[]= new int[11];
        num[1]= 1;  //  1   (1)
        num[2]= 2;  //  2, 1+1  (2)
        num[3]= 4;  //  3, 2+1, 1+1+1, 1+2  (4)
        //  1+3, 1+2+1, 1+1+2, 1+1+1+1, 2+2, 2+1+1, 3+1 (7)
        //  1+1+3, 1+1+2+1, 1+1+1+2, 1+1+1+1+1, 1+2+2, 1+2+1+1, 1+3+1, 2+3, 2+2+1, 2+1+1+1, 2+1+2, 3+2, 3+1+1   (13)


        while(t-->0){
            int n= Integer.parseInt(br.readLine());

            if(num[n]==0){
                for(int i=4;i<=n;i++){
                    num[i]= num[i-1]+num[i-2]+num[i-3];
                }
            }

            sb.append(num[n]+"\n");
        }

        System.out.println(sb);
    }
}
