import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Beakjoon2999 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //String str= br.readLine();
        //int len= str.length();
        char alpha[]= br.readLine().toCharArray();
        int len= alpha.length;

        int r= 1;
        int c= 1;
        for(int r_check=1;r_check<len;r_check++){
            int c_check= len/r_check;
            if(r_check<=c_check && r_check*c_check==len){
                r= r_check;
                c= c_check;
            }
        }

        StringBuilder sb= new StringBuilder();
        for(int i=0; i<r; i++){
            for(int j=0;j<c;j++){
                sb.append(alpha[j*r+i]);
            }
            //sb.append("\n");
        }

        //System.out.println("len="+len+" r="+r+" c="+c);
        //System.out.println(Arrays.toString(alpha));
        System.out.println(sb);
    }
}
