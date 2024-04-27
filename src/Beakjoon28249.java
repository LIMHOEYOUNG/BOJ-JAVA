import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon28249 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int total= 0;

        while(n-->0){
            String str= br.readLine();

            switch (str){
                case "Poblano":
                    total+=1500;
                    break;

                case "Mirasol":
                    total+=6000;
                    break;

                case "Serrano":
                    total+=15500;
                    break;

                case "Cayenne":
                    total+=40000;
                    break;

                case "Thai":
                    total+=75000;
                    break;

                case "Habanero":
                    total+=125000;
                    break;
            }
        }
        System.out.println(total);
    }
}
