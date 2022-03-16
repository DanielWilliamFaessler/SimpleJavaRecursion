package ch.bbw;

import java.io.File;

public class Main {

    public static void main(String[] args) {


    }
    public void readFolder(String folder){
        File f = new File("C:/Users/danie/Documents");
        File[] fileArray = f.listFiles();
        for (int i = 0; i < fileArray.length; i++) {
            System.out.println(fileArray[i].getName());
            if (fileArray[i].isDirectory()==true){
                readFolder(fileArray[i].getAbsolutePath());
            }
            else {
                System.out.println(fileArray[i]);
            }
        }

    }
}
