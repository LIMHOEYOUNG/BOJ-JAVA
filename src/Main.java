import java.io.*;
import java.util.*;

public class Main {
    static int routeCheck[]= new int [4];
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

//1463, 토마토 다시
