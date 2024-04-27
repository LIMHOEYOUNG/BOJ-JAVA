import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5074 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());

            String time1= st.nextToken();
            String time2= st.nextToken();
            if(time1.equals("00:00") &&time2.equals("00:00")) break;

            String t1[]= time1.split(":");
            String t2[]= time2.split(":");

//            System.out.println("t1 = "+t1[0]+" "+t1[1]);
//            System.out.println("t2 = "+t2[0]+" "+t2[1]);

            int mm= Integer.parseInt(t1[1])+ Integer.parseInt(t2[1]);
            int hh= Integer.parseInt(t1[0])+ Integer.parseInt(t2[0]);

            if(mm>=60){
                hh+=mm/60;
                mm%=60;
            }

            if(hh>=24){
                //sb.append((hh%24)+":"+mm+" +"+(hh/24)+"\n");
                sb.append(String.format("%02d:%02d +%d\n",(hh%24),mm,(hh/24)));
            }

            else{
                //sb.append(hh+":"+mm+"\n");
                sb.append(String.format("%02d:%02d\n",(hh%24),mm));
            }
        }

        System.out.println(sb);
    }
}
