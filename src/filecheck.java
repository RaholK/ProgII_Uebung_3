import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecheck {
    public static void main(String[] args) {
        try{
            /*
            FileReader r = new FileReader("text.txt");
            while(r.read() != -1) {

            }*/
            //FileWriter d = new FileWriter("text.txt", true);
            //d.write("lol spodifjwopfganwgpo \n");
           // d.append();
           // d.close();
            FileReader d = new FileReader("list.csv");
        }
        catch (IOException e) {
            System.out.println("existiert nicht");
        }

    }
}
