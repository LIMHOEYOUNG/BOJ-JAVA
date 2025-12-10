import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20528 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        char std= st.nextToken().charAt(0);
        boolean check= true;

        for(int i=0;i<n-1;i++){
            if(std!= st.nextToken().charAt(0)){
                check= false;
                break;
            }
        }

        System.out.println(check?1:0);
    }
}
