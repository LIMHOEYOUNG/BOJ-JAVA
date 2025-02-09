import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon9907 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        int num[]= new int[7];

        for(int i=0;i<str.length();i++){
            num[i]= str.charAt(i)-'0';
        }

        int n= num[0]*2 + num[1]*7 + num[2]*6 + num[3]*5 + num[4]*4 + num[5]*3 + num[6]*2;

        switch (n%11){
            case 0:
                System.out.println("J");
                break;
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("F");
                break;
            case 7:
                System.out.println("G");
                break;
            case 8:
                System.out.println("H");
                break;
            case 9:
                System.out.println("I");
                break;
            case 10:
                System.out.println("Z");
                break;
        }
    }
}
