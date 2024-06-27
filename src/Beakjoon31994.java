import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon31994 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String ans="";
        int max_personnel=0;
        for(int i=0;i<7;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String class_name= st.nextToken();
            int personnel= Integer.parseInt(st.nextToken());
            if(max_personnel<personnel){
                ans=class_name;
                max_personnel=personnel;
            }
        }

        System.out.println(ans);
    }
}
