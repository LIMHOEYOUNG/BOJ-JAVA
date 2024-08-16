import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon26531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        String forms[] =new String[5];

        int k=0;
        for(int i=0;i<9;i++){
            char c=  str.charAt(i);
            if(c!=' ') {
                forms[k]= Character.toString(c);
                k++;
            }
        }

        if(Integer.parseInt(forms[forms.length-1])==(Integer.parseInt(forms[0])+Integer.parseInt(forms[2]))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
