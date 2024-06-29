import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int m= Integer.parseInt(st.nextToken());
        int s= Integer.parseInt(st.nextToken());
        int g= Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        double a= Double.parseDouble(st.nextToken());
        double b= Double.parseDouble(st.nextToken());

        st= new StringTokenizer(br.readLine());
        int l= Integer.parseInt(st.nextToken());
        int r= Integer.parseInt(st.nextToken());

        double w=(l/a)+(m/g);
        double stand=(r/b)+(m/s);

        //System.out.println("w = "+w+"\nstand = "+stand);

        System.out.println(w>stand?"latmask":"friskus");
    }
}
