import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10769 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        int happy= 0;
        int sad= 0;
        boolean trig= true;

        for(int i=0;i<str.length()-2;){
            //System.out.println(str.substring(i,i+3));
            if((str.substring(i,i+3)).equals(":-)")){
                happy++;
                trig= false;
                i+=2;
            }
            else if((str.substring(i,i+3)).equals(":-(")){
                sad++;
                trig= false;
                i+=2;
            }
            else{
                i++;
            }
        }

        //System.out.println("happy = "+happy+" sad = "+sad);
        System.out.println(trig?"none":happy>sad?"happy":happy<sad?"sad":"unsure");
    }
}
