import java.io.IOException;

public class Beakjoon6376 {
    public static StringBuilder sb= new StringBuilder();
    public static double[] val= new double[11];
    public static void main(String[] args)throws IOException {

        sb.append("n e\n").append("- -----------\n");
        val[0]= 1;
        val[1]= 2;

        sb.append(0).append(" ").append((long)val[0]).append("\n");
        sb.append(1).append(" ").append((long)val[1]).append("\n");
        for(int i=2;i<10;i++){
            calc(i);
            sb.append(i).append(" ").append(((val[i]*100000000)%10000000.0==0)?val[i]+"\n": String.format("%.9f\n",val[i]));
        }

        System.out.print(sb);
    }

    private static void calc(int n){
        double denominator= 1.0;
        for(int i=n;i>0;i--){
            denominator*=i;
        }

        val[n]=val[n-1]+(1/denominator);
    }
}