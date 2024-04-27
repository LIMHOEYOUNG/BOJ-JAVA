import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Beakjoon1343 {
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        int count=0;
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c=='.'){
                if(count>0) {
                    add_str(count);
                }
                sb.append(".");
                count=0;
            }
            else if (c=='X')count++;
        }
        add_str(count);
        System.out.println(sb);
    }

    private static void add_str(int count){

        int a = count/4;
        int b= count%4;

        if((b%2)!=0){
            System.out.println(-1);
            System.exit(0);
        }
        else{
            for(int j=0;j<a;j++){
                sb.append("AAAA");
            }
            if(b>0) {
                sb.append("BB");
            }
        }
    }
}


/*
BB.AAAAAAAABB..AAAAAAAA...AAAABB
BB.AAAAAAAABB..AAAAAAAA...AAAABB

 */