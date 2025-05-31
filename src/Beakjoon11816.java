import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11816 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //String s= br.readLine();
        //System.out.println(Integer.toString(Integer.parseInt(s),16));

        String str= br.readLine();
        int x= 0;
        int ans= 0;

        if(str.contains("0x")){ //16

            for(int i=str.length()-1;i>1;i--){
                char c= str.charAt(i);

                //System.out.println(c+" => "+Character.getNumericValue(c));

                ans+= Character.getNumericValue(c)*Math.pow(16,x);
                x++;
            }

            System.out.println(ans);
        }
        else if(str.charAt(0)=='0'){    //8
            for(int i=str.length()-1;i>0;i--){
                char c= str.charAt(i);

                //System.out.println(c+" => "+Character.getNumericValue(c));

                ans+= Character.getNumericValue(c)*Math.pow(8,x);
                x++;
            }

            System.out.println(ans);
        }
        else{   //10
            System.out.println(str);
        }
    }
}
