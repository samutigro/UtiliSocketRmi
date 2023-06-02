import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(3456);
        //qua si crea l'istanza dell'oggetto passivo es.coda o deposito
        System.out.println("server partito");
        try{
            while(true){
                Socket s = serverSocket.accept();
                System.out.println("connseeione col client effettuata");
                ThreadSlave t = new ThreadSlave(s); //si possono modificare le variabili in input se ne servono altre
            }
        }finally {
            serverSocket.close();
        }
    }
}

/*se qualcosa non va controllare
module prova3_RMI {
    exports pack; // Export the 'pack' package
    requires java.rmi; // Specify the dependency on the 'java.rmi' module
}

le classi che si spediscono devono implementare serializable*/
