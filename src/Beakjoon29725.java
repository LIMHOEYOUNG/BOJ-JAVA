import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon29725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int point[]= {0,1,3,3,5,9,0,-1,-3,-3,-5,-9};
        char chess[]= {'K','P','N','B','R','Q','k','p','n','b','r','q'};

        int score= 0;
        for(int i=0;i<8;i++){
            String str= br.readLine();
            for(char c:str.toCharArray()){
                for(int j=0;j<chess.length;j++){
                    if(c==chess[j]){
                        score+=point[j];
                        break;
                    }
                }
            }
        }

        System.out.println(score);
    }
}
