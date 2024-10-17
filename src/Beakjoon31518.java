import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon31518 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        for(int i=0;i<3;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            boolean check= false;

            while(st.hasMoreTokens()){
                if(Integer.parseInt(st.nextToken())==7){
                    check=true;
                    break;
                }
            }

            if(!check){
                System.out.println(0);
                return;
            }
        }

        System.out.println(777);
    }
}

/*
7
0 1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7
 */