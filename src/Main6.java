import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main6 {
    public static void main(String[] args) {
        try {
            //You put the entire bufferReader and new Filereader inside of a try catch
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/amir.saunders/Desktop/Test/output.txt"));
            String s;
            while ((s = br.readLine()) !=null){
                System.out.println(s);
            }
            br.close();
        } catch (Exception ex) {
            return;
        }

    }
}
