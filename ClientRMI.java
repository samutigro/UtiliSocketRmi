import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    //qua i suoi campi
    public Client(){
        //ciò che serve
    }

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(1099);
        RemoteInterface server = (RemoteInterface) registry.lookup("SERVER");
        //ora col riferimento al server si possono chaiamre i suoi metodi come se fosse un oggetto del client
    }
}
