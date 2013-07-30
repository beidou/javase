import java.io.*;

/**
 * Created by Administrator on 13-7-29.
 */
public class IOtest {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inputStream = new FileInputStream("D:/java.txt");
            OutputStream outputStream = new FileOutputStream("D:/Day.txt");
            int i = 0;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
                outputStream.write(i);
//            }
//            while((!=-1)){
//                System.out.print((char)i);
            }
        } catch (IOException e) {
//            e.printStackTrace();

        }
    }
}


