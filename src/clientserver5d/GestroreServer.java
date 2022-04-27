package clientserver5d;

/**
 *
 * @author hp
 */
public class GestroreServer {
    public static void main(String[] args){
        Server srv = new Server(2000);
        srv.inAscolto();
    }
    
}
