import java.util.ArrayList; 
import java.util.List; 
import java.util.Iterator;
import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;


public class Hallo {
    public static void main(String[] args) throws Exception {

        
        Writer fw = new FileWriter("test.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Jan fühlt sich Disco!");
        bw.write("Er ist so high");
        bw.newLine();
        bw.close();

    }
}