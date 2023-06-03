import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ThreadSlave extends Thread{
    //qua ci va il campo dell'oggetto passivo se serve
    ObjectOutputStream out;
    ObjectInputStream in;
    Socket socket;

    public ThreadSlave(Socket s) throws IOException {
        out=new ObjectOutputStream(s.getOutputStream());
        in=new ObjectInputStream(s.getInputStream());
        socket=s;
        //aggiungere in caso l'oggetto passivo
        this.start();
    }

    public void exec(){
        //qua metti ad esempio la gestione dei comandi richiesti dal client e li gestisci chiamando i metodi dell'oggetto passivo
        //ricordarsi il comando END
    }

    public void run(){
        boolean finito = false;
        String cmd = "";
        try{
            //qua metti ad esempio l'esecuzione di exec e la lettura dell'input dal client
            while (!finito){
                
                    cmd = (String) in.readObject();
               
                if(cmd.equals("END")){
                    finito=true;
                }else{
                    exec(cmd);         
                }
            }
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
