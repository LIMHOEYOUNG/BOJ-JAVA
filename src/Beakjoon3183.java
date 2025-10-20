import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3183 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb= new StringBuilder();
        int[] ds={0,31,28,31,30,31,30,31,31,30,31,30,31};

        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int d= Integer.parseInt(st.nextToken());
            int m= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());
            if(d==0 && m==0 && y==0) break;


            if(1<=m && m<=12) {
                if (y%4==0 && y%100!=0 || y%400==0){
                    ds[2]=29;
                }
                System.out.println((y%4==0 && y%100!=0 || y%400==0)+" "+ds[m]+" "+d);

                if (1 <= d && d <= ds[m]) {
                    sb.append("Valid");
                } else {
                    sb.append("Invalid");
                }

                ds[2]=28;
            }
            else{
                sb.append("Invalid");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
/*
29 2 1974
29 2 1975
29 2 1976
29 2 1977
29 22 1977
0 0 0
 */