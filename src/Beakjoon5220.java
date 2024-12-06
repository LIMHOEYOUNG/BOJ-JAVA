import java.util.Scanner;

public class Beakjoon5220 {

    /* Given a value and a checkbit, return "true" if the check bit matches
     * up with the "value", and "false" otherwise. */
    private static boolean solveErrorDetection(int value, int checkbit) {
        boolean valid = false;
        int checkOne=0;
        //짝수 개의 1을 가지고 있으므로 검사 비트는 0
        /* ------------------- INSERT CODE HERE ---------------------*/
        while(value!=0){
            if(value % 2 == 1) {
                checkOne++;
            }
            value/=2;
        }

        valid= checkOne%2==checkbit?true:false;
        /* -------------------- END OF INSERTION --------------------*/

        return valid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {

            int value = sc.nextInt();

            int checkbit = sc.nextInt();

            if (solveErrorDetection(value, checkbit)) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Corrupt");
            }
        }
    }
}
