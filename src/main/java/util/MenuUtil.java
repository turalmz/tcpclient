/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;

/**
 *
 * @author TURAL
 */
public class MenuUtil{

    public static void proccess() throws Exception {

        while (Config.getMismatch() <= 3) {

            if (!Config.isIsRegistered()) {
                register();

            } else {

                if (!Config.isIsFileNameExisted()) {
                    getFileName();

                } else {

                    if (!Config.isIsIpPosrtExisted()) {
                        getIpPort();

                    } else {
                        byte[] file = getFile();
                        if(file.length>0){
                        sendfile(file);
                        break;
                        }
                    }

                }
            }
        }

        if (Config.getMismatch() >= 3) {
            System.out.println("Too much mismatch entered!!!");
        }else{
            System.out.println("Sent successfully!!!");
        }
    }

    static boolean register() {
        String firstname = InputUtil.getLine("Enter your firstname");

        String lastname = InputUtil.getLine("Enter your lastname");

        if (firstname.isEmpty() || lastname.isEmpty()) {
            Config.addMismatch();
            return false;
        }
        Config.setFirstname(firstname);
        Config.setLastname(lastname);
        Config.setIsRegistered(true);
        return true;
    }

    static boolean getFileName() {
        String fileName = InputUtil.getLine("Enter file path and name");
        if (fileName.isEmpty()) {
            Config.addMismatch();
            return false;
        }
        Config.setFileName(fileName);
        Config.setIsFileNameExisted(true);

        return true;
    }

    static boolean getIpPort() {

        String ipPort = InputUtil.getLine("Enter ip and port");
        String[] arr = ipPort.split(":");
        String ip = arr[0];
        int port = Integer.parseInt(arr[1]);
        if (arr[0].isEmpty() || arr[1].isEmpty()) {
            Config.addMismatch();
            return false;
        }
        Config.setPort(port);
        Config.setIp(ip);
        Config.setIsIpPosrtExisted(true);
        return true;

    }
    
    static byte[] getFile() throws Exception {
        return FileUtility.readBytes(Config.getFileName());
    }
    
    static void sendfile(byte[] bt )throws Exception {

         TCPClientUtil.sendFile(bt);
    }
}
