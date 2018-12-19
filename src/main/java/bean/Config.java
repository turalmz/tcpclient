/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author TURAL
 */
public class Config {

    static private String firstname ;
    static private String lastname ;
    static private String fileName ;
    static private int port ;
    
    static private boolean isfileExisted =false ;
    static private boolean isRegistered = false;
    static private boolean isFileNameExisted = false;
    static private boolean isIpPosrtExisted = false;

    public static boolean isIsRegistered() {
        return isRegistered;
    }

    public static void setIsRegistered(boolean isRegistered) {
        Config.isRegistered = isRegistered;
    }

    public static boolean isIsFileNameExisted() {
        return isFileNameExisted;
    }

    public static void setIsFileNameExisted(boolean isFileNameExisted) {
        Config.isFileNameExisted = isFileNameExisted;
    }

    public static boolean isIsIpPosrtExisted() {
        return isIpPosrtExisted;
    }

    public static void setIsIpPosrtExisted(boolean isIpPosrtExisted) {
        Config.isIpPosrtExisted = isIpPosrtExisted;
    }

    public static int getMismatch() {
        return mismatch;
    }

    public static void addMismatch() {
        Config.mismatch ++;
    }
    static private String ip ;
    static private int mismatch=0;

    public static String getFirstname() {
        return firstname;
    }

    public static void setFirstname(String firstname) {
        Config.firstname = firstname;
    }

    public static String getLastname() {
        return lastname;
    }

    public static void setLastname(String lastname) {
        Config.lastname = lastname;
    }

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        Config.fileName = fileName;
    }

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        Config.port = port;
    }

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        Config.ip = ip;
    }

}
