import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon8595 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        StringBuilder convert_1= new StringBuilder("0");
        long ans2= 0;

        //long ans= 0;
        //String convert= "";

        for(int i=0;i<n;i++){
            char c= str.charAt(i);

            if('0'<=c && c<='9'){
                //convert+=c;
                convert_1.append(c);
            }
            else{
                //ans+= Long.parseLong(convert.equals("")?"0":convert);
                ans2+= Long.parseLong(convert_1.toString());

                //convert= "";
                convert_1.setLength(0);
                convert_1.append("0");
            }
        }
        //ans+= Long.parseLong(convert.equals("")?"0":convert);
        ans2+= Long.parseLong(convert_1.toString());
        //System.out.println(ans);
        System.out.println(ans2);
    }
}
