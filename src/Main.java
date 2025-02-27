import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //9093
        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                sb.append((new StringBuilder(st.nextToken()).reverse())).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}

//1463, 토마토 다른 풀이로 가능 다시
