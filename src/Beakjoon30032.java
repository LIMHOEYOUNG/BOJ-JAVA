import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int d= Integer.parseInt(st.nextToken());

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            String str= br.readLine();

            for(int j=0;j<str.length();j++){
                char c= str.charAt(j);
                if(d==1){
                    if(c=='b'){
                        sb.append('p');
                    }
                    else if(c=='d'){
                        sb.append('q');
                    }
                    else if(c=='p'){
                        sb.append('b');
                    }
                    else if(c=='q'){
                        sb.append('d');
                    }
                }
                else{
                    if(c=='b'){
                        sb.append('d');
                    }
                    else if(c=='d'){
                        sb.append('b');
                    }
                    else if(c=='p'){
                        sb.append('q');
                    }
                    else if(c=='q'){
                        sb.append('p');
                    }
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
