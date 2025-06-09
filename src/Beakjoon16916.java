import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon16916 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str1= br.readLine();
        String str2= br.readLine();
        int str2_len= str2.length();
        int ans= 0;

        //System.out.println(str1.length()-str2.length()+" "+str2.length());
        for(int i=0;i<(str1.length()-str2.length());i++){
            //System.out.println(i+" "+(i+str2_len));
            String check= str1.substring(i,i+str2_len);
            System.out.println("check = "+check);

            if(check.equals(str2)){
                ans++;
                //i+=str2_len;
            }
            else{
                //i++;
            }
        }

        System.out.println(ans);
    }
}
