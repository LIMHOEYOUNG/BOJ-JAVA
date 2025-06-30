import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon2456 {
    private static int cnt[][];
    private static int score[];
    private static HashMap<Integer, Integer> candidate= new HashMap<>();
    private static List<Integer> sameScore= new ArrayList<>();
    private static long scoreMax= 0;
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());


        score= new int[n+1];

        cnt= new int[n+1][4];

        candidate.put(1,0);
        candidate.put(2,0);
        candidate.put(3,0);

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());

            addScore(a,b,c,(i+1)==n);

            cnt[1][a]+=1;
            cnt[2][b]+=1;
            cnt[3][c]+=1;
        }

        //printCnt();

        if(sameScore.size()>1){
            int dropout= Integer.MIN_VALUE;
            //List<Integer> dropout= new ArrayList<>();

            //3점부터 확인
            for(int k=3;k>0;k--){
                //System.out.println(k+" => "+Arrays.deepToString(cnt));
                boolean dupcheck= false;

                int maxElenment= Integer.MIN_VALUE;
                int num= Integer.MIN_VALUE;

                //int i: sameScore
                //System.out.println("sameScore의 크기 = "+sameScore.size());
                for(int i: sameScore){

                    //상위 문제에서 최대 투표수 보다 미달인 ㅈㅏ
                    if(i== dropout) {
                        //System.out.println("통과합니다");
                        continue;
                    }

                    //System.out.println(k+" 점의 투표수 확인 maxelement = "+maxElenment+"\t"+i+"번 후보의 투표수 = "+cnt[i][k]);
                    if(maxElenment!=cnt[i][k]){
                        if(maxElenment<cnt[i][k]){
                            dropout= dropout!=Integer.MIN_VALUE?dropout:num;
                            num= i;
                            maxElenment= cnt[i][k];
                            dupcheck= false;
                        }
                        else{
                            dropout= i;
                        }
                    }
                    else if(maxElenment==cnt[i][k]){
                        dupcheck= true;
                    }

                    //System.out.println(k+" 점수의 최고 횟수 = "+maxElenment);
                }

                //System.out.println("dropout = "+dropout+" k = "+k+" dupcheck = "+dupcheck+" maxElenment = "+maxElenment);

                if(dupcheck){
                    //System.out.println("if 문 "+dupcheck+" "+k+" dropout = "+dropout);
                    System.out.println(0+" "+scoreMax);
                    break;
                }
                else if(!dupcheck){
                    //System.out.println("else if 문 "+!dupcheck+" "+k+" dropout = "+dropout);
                    System.out.println(num+" "+candidate.get(num));
                    break;
                }
            }
        }
        else{
            int selected= sameScore.get(0);
            System.out.println(selected+" "+candidate.get(selected));
        }

    }

    private static void addScore(int a, int b, int c,boolean check){
        int s[]= {0,a,b,c};
        int max=0 ;
        for(int i=1;i<=3;i++){
            //System.out.println(i+"후보 점수 업데이트\t| 기존"+candidate.get(i)+" 변경 "+(candidate.get(i)+s[i]));
            max= Math.max(candidate.get(i)+s[i],max);
            candidate.put(i,candidate.get(i)+s[i]);
        }
        //System.out.println();

        if(check){
            //System.out.println("max Score= "+max);
            for(int i=1;i<=3;i++){
                //System.out.println(i+" 후보 점수 = "+candidate.get(i));

                if(max== candidate.get(i)){
                    sameScore.add(i);
                }
            }
        }

        /*
        if(sameScore.size()>1) {
            System.out.print("중복자 = ");
            for(int i=0;i<sameScore.size();i++){
                System.out.print(sameScore.get(i)+" ");
            }
            System.out.println();
        }
        */

        scoreMax= max;
    }
    private static void printCnt(){
        for(int i=1;i<4;i++){
            System.out.print(i+" 후보의 점수별 투표수 ");
            for(int j=3;j>0;j--){
                System.out.print(j+" 점 = "+cnt[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
/*
4
2 2 1
3 2 3
2 2 3
3 2 3

10 8 10

3
1 2 3
3 2 1
2 2 2

4
1 2 3
2 1 3
3 2 1
2 3 1

4
3 1 2
1 3 2
2 3 1
3 2 1

4
2 3 1
2 1 3
2 1 3
2 3 1

3
2 3 1
2 1 3
2 2 2

6
3 3 3
3 3 3
2 3 1
2 1 2
1 1 1
2 2 2

 */