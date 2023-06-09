import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements RemoteInterface {
	private static final long serialVersionUID = 1L;

    //qua metti il campo dell'oggetto passivo se serve
    protected ServerImpl() throws RemoteException {
        super();
        //se hai messo l'oggetto passivo qua lo crei
    }

    //qua implementi i metodi dell'interfaccia

    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(1099);
        ServerImpl server = new ServerImpl();
        registry.rebind("SERVER",server);
    }
}

/*se qualcosa non va controllare
module prova3_RMI {
    exports pack; // Export the 'pack' package
    requires java.rmi; // Specify the dependency on the 'java.rmi' module
}

le classi che si spediscono devono implementare serializable e avere private static final long serialVersionUID = 1L;
*/
