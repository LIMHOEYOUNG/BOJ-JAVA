import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5586 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        String joi= "JOI";
        int joi_cnt= 0;
        String ioi= "IOI";
        int ioi_cnt= 0;
        boolean check= false;
        int i=0;
        String s="";

        for(;i<str.length();){
            //System.out.println("i = "+i+" str.l = "+str.length());
            if((i+3)<=str.length()) s= str.substring(i,i+3);
            else break;
            //System.out.println("s => "+s);
            if(s.equals(joi)) {
                joi_cnt++;
                i+=2;
            }
            else if(s.equals(ioi)) {
                ioi_cnt++;
                i+=2;
            }
            else i++;
            //System.out.println(joi_cnt+" "+ioi_cnt+"\n===========");

        }

        //System.out.println("ans = >"+joi_cnt+" "+ioi_cnt);
        System.out.println(joi_cnt+"\n"+ioi_cnt);
    }
}
