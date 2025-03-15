import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2846 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int max= 0;
        int startPoint= Integer.parseInt(st.nextToken());
        int beforePoint= startPoint;
        while(st.hasMoreTokens()){
            int p= Integer.parseInt(st.nextToken());
            if(beforePoint>=p){
                //System.out.println("if(beforePoint>p)");
                //System.out.println("startPoint = "+startPoint+"\nbeforePoint = "+beforePoint+"\np = "+p+"\n==================\n");
                max= Math.max(max,(beforePoint-startPoint));
                startPoint=p;
                beforePoint=p;
                //System.out.println("startPoint = "+startPoint+"\nbeforePoint = "+beforePoint+"\np = "+p);

            }
            else{
                beforePoint=p;
                if(!st.hasMoreTokens()){
                    //System.out.println("if(!st.hasMoreTokens())");
                    //System.out.println("startPoint = "+startPoint+"\nbeforePoint = "+beforePoint+"\np = "+p+"\n=====================\n");
                    max= Math.max(max,(beforePoint-startPoint));
                }
                //System.out.println("None");
                //System.out.println("startPoint = "+startPoint+"\nbeforePoint = "+beforePoint+"\np = "+p+"\n=====================\n");
            }
        }

        System.out.println(max);
    }
}
