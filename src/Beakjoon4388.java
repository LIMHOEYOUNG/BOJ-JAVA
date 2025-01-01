import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String n1= st.nextToken();
            String n2= st.nextToken();

            //String n1= "9999";
            //String n2= "1";

            if(n1.equals("0") && n2.equals("0")) break;

            //if(n1.length()<n2.length()) cnt= calc(n2,n1,cnt);
            //else cnt= calc(n1,n2,cnt);


            sb.append(calc(n1,n2)+"\n");
        }

        System.out.println(sb);
    }
    public static int calc(String n1, String n2){
        boolean upCheck= false;
        int c1=Integer.parseInt(n1);
        int c2=Integer.parseInt(n2);
        int cnt=0;


        while((c1!=0) || (c2!=0)){
            int targetN1= c1%10;
            int targetN2= c2%10;

            if(targetN1+targetN2+(upCheck?1:0)>=10){
                cnt++;
                upCheck= true;
            }
            else{
                upCheck= false;
            }

            //System.out.println(targetN1+" "+targetN2+" "+upCheck);

            c1/=10;
            c2/=10;
        }
        /*
        n2= String.format("%"+n1.length()+"s",n2).replace(' ','0');


        for(int i=n1.length()-1;i>=0;i--){
            c1= n1.charAt(i)-'0';

            try{
                c2= n2.charAt(i)-'0';
            }
            catch (StringIndexOutOfBoundsException e){
                c2= 0;
            }

            if((c1+c2+(upCheck?1:0))>=10){
                cnt++;
                upCheck= true;
            }
            else{
                upCheck= false;
            }

            //System.out.println(c1+" + "+c2+" + "+upCheck);

        }

        if((n1.length()>n2.length())&&upCheck&&(n1.charAt(0)==9)) cnt++;

         */

        //System.out.println("c1 = "+(c1!=0)+" c2 = "+(c2!=0));
        //System.out.println("=======");
        return cnt;
    }
}