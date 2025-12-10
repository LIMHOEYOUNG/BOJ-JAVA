import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11367 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<t;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String name= st.nextToken();
            int score= Integer.parseInt(st.nextToken());

            if(97<=score && score<=100){
                sb.append(name).append(" A+\n");
            }
            else if(90<=score && score<97){
                sb.append(name).append(" A\n");
            }
            else if(87<=score && score<90){
                sb.append(name).append(" B+\n");
            }
            else if(80<=score && score<87){
                sb.append(name).append(" B\n");
            }
            else if(77<=score && score<80){
                sb.append(name).append(" C+\n");
            }
            else if(70<=score && score<77){
                sb.append(name).append(" C\n");
            }
            else if(67<=score && score<70){
                sb.append(name).append(" D+\n");
            }
            else if(60<=score && score<67){
                sb.append(name).append(" D\n");
            }
            else if(0<=score && score<60){
                sb.append(name).append(" F\n");
            }
        }

        System.out.print(sb);
    }
}
/*
1
Eric 100
 */
