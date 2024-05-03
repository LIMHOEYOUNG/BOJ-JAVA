import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Beakjoon31775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        boolean l= false;
        boolean k= false;
        boolean p= false;

        for(int i=0;i<3;i++){
            String str= br.readLine();
            char check= str.charAt(0);
            switch (check){
                case 'l':
                    l=true;
                    break;
                case 'k':
                    k=true;
                    break;
                case 'p':
                    p=true;
                    break;
            }
        }

        System.out.println(l&&k&&p?"GLOBAL":"PONIX");
    }
}
