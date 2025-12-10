import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Beakjoon13698 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        int[] cups= {0,1,0,0,2};
        int str_len= str.length();
        /*
        a 1<->2
        b 1<->3
        c 1<->4
        d 2<->3
        e 2<->4
        f 3<->4
         */

        for(int i=0;i<str_len;i++){
            char c= str.charAt(i);

            switch (c){
                case 'A':
                    change(cups, 1,2);
                    break;
                case 'B':
                    change(cups, 1,3);
                    break;
                case 'C':
                    change(cups, 1,4);
                    break;
                case 'D':
                    change(cups, 2,3);
                    break;
                case 'E':
                    change(cups, 2,4);
                    break;
                case 'F':
                    change(cups, 3,4);
                    break;
            }

            //System.out.println(Arrays.toString(cups));
        }

        int s_ball= 0;
        int b_ball= 0;
        for(int i=1;i<cups.length;i++){
            if(cups[i]==1) s_ball= i;
            else if(cups[i]==2) b_ball= i;
        }

        System.out.println(s_ball+"\n"+b_ball);
    }

    private static void change(int[] cups, int idx1, int idx2){
        int tmp= cups[idx1];
        cups[idx1]= cups[idx2];
        cups[idx2]= tmp;
    }
}
