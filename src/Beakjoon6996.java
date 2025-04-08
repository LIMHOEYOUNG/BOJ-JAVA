import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Beakjoon6996 {

    private static boolean solveAnagrams(String first, String second ) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */
        if(first.length()!=second.length()) return false;

        ArrayList<String> check= new ArrayList<>();
        for(int i=0;i<first.length();i++){
            check.add(Character.toString(first.charAt(i)));
        }

        for(int i=0;i<first.length();i++){
            String s= Character.toString(second.charAt(i));
            if(check.contains(s)){
                check.remove(s);
            }
        }

        return check.isEmpty()?true:false;
        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
