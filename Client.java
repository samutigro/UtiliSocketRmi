//abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-=[]{}|;':",.<>/?`

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    //avrà un metodo probabilmente run perchè prima era un thread
    ObjectOutputStream out;
    ObjectInputStream in;
    Socket socket;

    public Client(){

    }
    public void run() throws IOException {
        InetAddress ip = InetAddress.getByName(null);
        Socket s = new Socket(ip,3456);
        out=new ObjectOutputStream(s.getOutputStream());
        in=new ObjectInputStream(s.getInputStream());
        socket=s;

        //qua tramite out.writeObject() manderà i comandi e potrà ricevere cose con in.readObject()
        try{

        }finally {
            out.writeObject("END");
            out.flush();
            out.close();
        }
    }

    public static void main(String[] args) {
        //main per far partire il client
    }
}
