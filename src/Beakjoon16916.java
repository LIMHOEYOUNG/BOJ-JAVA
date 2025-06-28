import java.io.*;

/*
시도과정 1
-> str2문자열 뭉텡이 반복문을 할려고함
문제점: 해당 문자열이 지나간 자리에 답이 존재하는 경우가 있어서 코드 삭제

시고과정 2
내장되어있는 함수 contains와 indexOf를 사용하면 안될까 생각함
O(NxM)인것을 간과한체

시도과정 3
KMP알고리즘이 기억이 안나 인터넷 서치를 하였고 알고리즘 이해 후 코드 작성
인터넷에 올라온 알고리즘의 시간초과여부가 궁금하여 그대로 제출하여 코드카피가 되어버림(95729483)
=>깊이 반성 중 죄송합니다.
 */

public class Beakjoon16916 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str1= br.readLine();
        String str2= br.readLine();

        System.out.println(kmp(str1,str2));
    }

    private static int kmp(String str1, String str2){
        //KMP알고리즘 시간복잡도: O(N+M)
        int arr[]= makePi(str2);

        for(int i=0, idx=0;i<str1.length(); i++) {

            while(idx>0 && str1.charAt(i)!=str2.charAt(idx)) {
                // 일치 or 하나도 일치하지 않은 상태까지 계속하여 걸침
                idx= arr[idx-1];
            }

            // 일치한 곳이 있다
            if(str1.charAt(i) == str2.charAt(idx)) {

                if(idx==str2.length()-1) return 1;
                else idx++;
            }
        }

        return 0;
    }

    private static int[] makePi(String str){
        int arr[]= new int[str.length()];

        for(int i=1, len=0;i<str.length();i++){
            while(len>0 && str.charAt(i)!=str.charAt(len)){
                len= arr[len-1];
            }

            if(str.charAt(i)==str.charAt(len)){
                arr[i]= (len+=1);
            }
        }

        return arr;
    }
}
