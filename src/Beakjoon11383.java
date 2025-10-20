import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11383 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        String[] str= new String[n+1];

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();

        for(int i=1;i<=n*2;i++){

            if(str[n]==null) str[i]= br.readLine();
            else{
                String s= br.readLine();

                for(int j=0;j<s.length();j+=2){
                    //System.out.println("compare => "+s.charAt(j)+);
                    //System.out.println(str[i-n].charAt(j/2)+" "+s.charAt(j)+" "+s.charAt(j)+" "+s.charAt(j+1));
                    if(str[i-n].charAt(j/2)!=s.charAt(j) || s.charAt(j)!=s.charAt(j+1)){
                        System.out.println("Not Eyfa");
                        return;
                    }
                }
                /*
                sb2.append(br.readLine());
                for(int j=0;j<str[i-n].length();j++){
                    sb1.append(str[i-n].charAt(j)).append(str[i-n].charAt(j));
                }

                if(!sb1.toString().contentEquals(sb2.toString())){
                    System.out.println("Not Eyfa");
                    return;
                }
                sb1.setLength(0);
                sb2.setLength(0);
                 */
            }
        }

        System.out.println("Eyfa");
    }
}
/*
2 2
AB
BA
AABB
ABBA
 */