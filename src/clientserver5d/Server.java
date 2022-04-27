package clientserver5d;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Server {
    ServerSocket SeSo;
    Socket So;
    
    public Server (int porta){
        try {
            SeSo = new ServerSocket(porta);
            System.out.println("OK il server è in ascolto");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inAscolto(){
        try {
            So = SeSo.accept();
            System.out.println("Connessione stabilita");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
