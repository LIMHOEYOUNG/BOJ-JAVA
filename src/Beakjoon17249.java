import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17249 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String[] check= (br.readLine()).split("\\(\\^0\\^\\)");
        int l= 0;
        int r= 0;
        for(int i=0;i<check.length;i++){
            String str= check[i];
            for(int j=0;j<str.length();j++){
                char c= str.charAt(j);
                if(c=='@' && i==0){
                    l++;
                }
                else if(c=='@' && i==1){
                    r++;
                }
            }
        }

        System.out.println(l+" "+r);
    }
}
/*
@===@==@=@==(^0^)==@=@===@

@==@===@==@====@==@====@====@==@==@==@==@==@========@====@==@==@====@==@==@==@==@====@==@==@==@==@==@====@==@==@==@====@==@==@==@==@==@==@====@==@==@====@==@==@==@==@==@====@==@==@==@====@====@==@====@====(^0^)==@======@======@
 */