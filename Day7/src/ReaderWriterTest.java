import java.io.*;

/**
 * Created by Administrator on 13-7-29.
 * 今天星期一
 */
public class ReaderWriterTest {
    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("Day7/src/ReaderWriterTest.java");
        Writer writer=new FileWriter("day.txt");
        int  i=0;
        while((i=reader.read())!=-1){
            System.out.print((char)i);
            writer.write(i);
        }
        reader.close();
        writer.close();
    }
}
