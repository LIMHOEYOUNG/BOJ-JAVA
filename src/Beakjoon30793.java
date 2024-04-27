import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30793 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        double p= Double.parseDouble(st.nextToken());
        double r= Double.parseDouble(st.nextToken());
        double v= p/r;


        //System.out.println("v = "+v);
        if(v<0.2) System.out.println("weak");
        else if(0.2<=v && v<0.4) System.out.println("normal");
        else if(0.4<=v && v<0.6) System.out.println("strong");
        else if(0.6<=v) System.out.println("very strong");
    }
}
