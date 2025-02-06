import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MakeEx {
    public static void main(String[] args)throws IOException{
        File f= new File("A.txt");
        if(!f.exists()) f.createNewFile();
        FileOutputStream fo= new FileOutputStream(f);

        for(int i=20000;i>0;i--){
            fo.write((Integer.toString(i)+"\n").getBytes());
        }

        fo.close();
    }
}
