import java.io.*;
//Gives us acess to file/ip
public class Main5 {
    public static void main(String[] args) {
        try {
            //You put the entire bufferwriter and new Filewriter inside of a try catch
            BufferedWriter bw = new BufferedWriter(
                    //You make a new BufferedWriter objcet and inside the buffered Writer parenthesis you make a next file writer.
                    new FileWriter("/Users/amir.saunders/Desktop/Test/output.txt"));
            //output.txt is the name of the file that I added to the path to create

            //After making a new file writer you put the path of the file you want to write to. If the file doesn't exist it is created. If it does exist it is overwritten
                bw.write("Karen\n");
                bw.write("chad\n");
                bw.write("Becky\n");
                bw.close();
                //The above add the Strings to the file that we created called output.txt
        } catch (Exception ex) {
            return;
        }
        //All the above is how you write to a file.
    }
}
