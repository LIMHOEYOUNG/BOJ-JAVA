import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());

        long allR= 0;
        long bedR= 0;
        long balcony= 0;

        while(n-->0){
            st= new StringTokenizer(br.readLine());
            int ai= Integer.parseInt(st.nextToken());
            String loc= st.nextToken();

            if(loc.equals("balcony")){
                balcony+=ai;
            }
            else{
                if(loc.equals("bedroom")) bedR+=ai;
                allR+=ai;
            }
        }

        System.out.println(allR+balcony);
        System.out.println(bedR);
        System.out.println((allR*c + ((double)balcony/2)*c));
    }
}
