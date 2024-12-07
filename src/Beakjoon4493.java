import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4493 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            int t= Integer.parseInt(br.readLine());
            int check=0;

            while(t-->0){
                StringTokenizer st= new StringTokenizer(br.readLine());

                String p1= st.nextToken();
                String p2= st.nextToken();

                if(!p1.equals(p2)){
                    if(p1.equals("R")&&p2.equals("S")){
                        check++;
                    }
                    else if(p1.equals("S")&&p2.equals("P")){
                        check++;
                    }
                    else if(p1.equals("P")&&p2.equals("R")){
                        check++;
                    }
                    else{
                        check--;
                    }
                }
            }

            sb.append(check==0?"TIE\n":check>0?"Player 1\n":"Player 2\n");
        }

        System.out.println(sb);
    }
}
