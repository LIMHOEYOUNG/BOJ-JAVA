import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon15947 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String[][] lyrics={
                {"baby", "sukhwan", "tururu", "turu"},
                {"very", "cute", "tururu", "turu"},
                {"in", "bed", "tururu", "turu"},
                {"baby", "sukhwan"}
        };

        String add_lyrics= "ru";
        int total_len= 14;

        int n= Integer.parseInt(br.readLine())-1;
        int cycle= n/14;
        int c= (n-total_len*cycle)/4;
        int r= (n-total_len*cycle)%4;

        String ans= lyrics[c][r];

        if(r>1&&c<3){
            if(r==2){   //2
                if(cycle+2>=5){
                    System.out.println("tu+ru*"+(cycle+2));
                }
                else{
                    for(int i=0;i<cycle;i++){
                        ans= ans+add_lyrics;
                    }
                    System.out.println(ans);
                }

                //java11
                //System.out.println(cycle+2>=5?("tu+ru*"+(cycle+2)):(ans+add_lyrics.repeat(cycle)));
            }
            else{       //1
                if(cycle+1>=5){
                    System.out.println("tu+ru*"+(cycle+1));
                }
                else{
                    for(int i=0;i<cycle;i++){
                        ans= ans+add_lyrics;
                    }
                    System.out.println(ans);
                }

                // java11
                //System.out.println(cycle+1>=5?("tu+ru*"+(cycle+1)):(ans+add_lyrics.repeat(cycle)));
            }
        }
        else{
            System.out.println(ans);
        }

    }
}