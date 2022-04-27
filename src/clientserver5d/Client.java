package clientserver5d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Client {
    Socket So;
    BufferedReader br;
    BufferedWriter bw;
    
    public Client(InetAddress ip, int porta){
        try {
            So = new Socket(ip, porta);
            br = new BufferedReader(new InputStreamReader(So.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String leggi(){
        try {
            String msg = "";
            msg = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }    
}
