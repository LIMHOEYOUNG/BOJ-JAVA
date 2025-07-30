import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon9243 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        if(n%2==0){
            System.out.println(str.equals(br.readLine())?"Deletion succeeded":"Deletion failed");
        }
        else{
            String str2= br.readLine();
            boolean check= false;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==str2.charAt(i)){
                    check= true;
                    break;
                }
            }

            System.out.println(check?"Deletion failed":"Deletion succeeded");
        }
    }
}
