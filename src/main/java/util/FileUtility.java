/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author sarkhanrasullu
 */
public class FileUtility {


    public static void writeBytes(String fileName, byte[] data) throws Exception {
        FileOutputStream fop = new FileOutputStream(fileName);
        // get the content in bytes
        fop.write(data);
        fop.flush();
        fop.close();

        System.out.println("Done");
    }


    public static byte[] readBytes(String fileName) throws Exception {
        File file = new File(fileName);

        try (FileInputStream fileInputStream = new FileInputStream(file);) {

            byte[] bytesArray = new byte[(int) file.length()];

            fileInputStream.read(bytesArray);
            return bytesArray;
        }
    }


}