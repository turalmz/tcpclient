/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author TURAL
 */
public class TCPClientUtil {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */

    
    public static void sendFile(byte[] bt) throws IOException, Exception{
    
        try (Socket socket = new Socket(Config.getIp(),Config.getPort())) {
            OutputStream output = socket.getOutputStream();
            DataOutputStream dataoutput = new DataOutputStream(output);
            dataoutput.writeInt(bt.length);
            dataoutput.write(bt);
        }
    }
}
