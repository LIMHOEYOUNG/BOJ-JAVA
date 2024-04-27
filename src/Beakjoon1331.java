import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1331 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        boolean check[][]= new boolean[6][6];
        int valid_X[]={2,1};
        int valid_y[]={1,2};

        String str= br.readLine();
        int before_front = str.charAt(0)-'A';
        int before_back= str.charAt(1)-'0'-1;
        check[before_front][before_back]=true;

        int last_check_front=before_front;
        int last_check_back=before_back;

        for(int i=0;i<35;i++){
            boolean flag= false;
            str= br.readLine();
            int front= str.charAt(0)-'A';
            int back= str.charAt(1)-'0'-1;

            int diff_x= Math.abs(front-before_front);
            int diff_y= Math.abs(back-before_back);

            //System.out.println("x = "+diff_x+" y = "+diff_y);

            for(int j=0;j<2;j++){
                if(valid_X[j]==diff_x && valid_y[j]==diff_y){
                    flag=true;
                    break;
                }
            }

            if(!flag || check[front][back]){
                System.out.println("Invalid");
                return;
            }

            check[front][back]=true;
            before_front=front;
            before_back=back;
            //sb.append(front+" "+back+"\n");
        }

        int last_front=Math.abs(last_check_front-before_front);
        int last_back= Math.abs(last_check_back-before_back);
        for(int j=0;j<2;j++){
            if(valid_X[j]==last_front && valid_y[j]==last_back){

                for(int i=0;i<6;i++){
                    for(int k=0;k<6;k++){
                        if(!check[i][k]){
                            System.out.println("Invalid");
                            return;
                        }
                    }
                }


                System.out.println("Valid");
                return;
            }
        }
        System.out.println("Invalid");
    }
}
