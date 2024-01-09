package multithreading.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {



    public static void main(String[] args) {

        String srcFile1 = "a.txt";
        String srcFile2 = "b.txt";
        String destFile1 = "c.txt";
        String destFile2 = "d.txt";
     new Thread(new CopyTask(srcFile1,destFile1)).start();
     new Thread(new CopyTask(srcFile2,destFile2)).start();
    }
}

class CopyTask implements Runnable {

    String srcFile;
    String destFile;




    public CopyTask(String srcFile,String destFile) {
        this.srcFile = srcFile;
        this.destFile = destFile;
    }

    @Override
    public void run() {
        try {
            IOUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class IOUtils {


    public static  void copy(FileInputStream src, FileOutputStream dest) throws IOException {
        int value;
        while ((value = src.read()) != -1) {
            dest.write(value);
        }
    }

        public static void copyFile(String srcFile, String destFile) throws IOException {
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            copy(fis,fos);
            fis.close();
            fos.close();

        }


}
