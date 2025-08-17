import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5656 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        for(int i=1;;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            String c= st.nextToken();
            int b= Integer.parseInt(st.nextToken());

            if(c.equals("E")) break;

            sb.append("Case ").append(i).append(": ");
            switch (c){
                case ">":
                    sb.append(a>b).append("\n");
                    break;
                case ">=":
                    sb.append(a>=b).append("\n");
                    break;
                case "<":
                    sb.append(a<b).append("\n");
                    break;
                case "<=":
                    sb.append(a<=b).append("\n");
                    break;
                case "==":
                    sb.append(a==b).append("\n");
                    break;
                case "!=":
                    sb.append(a!=b).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
