

import java.io.File;
import java.io.FileInputStream;
public class InputStream {

    public static void main(String[] args) {
        File file = null;
        FileInputStream fileInputStream = null;
        try {
            file = new File("/Users/sakethsmac/Desktop/ex.txt");
            fileInputStream = new FileInputStream(file);
            System.out.println("Available bytes in file: "+fileInputStream.available());
            int line;
            while ((line=fileInputStream.read()) != -1) {
                System.out.print((char)line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

}
