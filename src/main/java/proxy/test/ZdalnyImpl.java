import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Professional on 2018-01-26.
 */
public class ZdalnyImpl extends UnicastRemoteObject implements Zdalny{
    protected ZdalnyImpl() throws RemoteException {
    }

    @Override
    public String powiedzHej() throws RemoteException {
        return "Serwer mówi Hej";
    }

    public static void main(String[] args) {
        try {
            Zdalny usluga = new ZdalnyImpl();
            Naming.rebind("ZdalneHej",usluga);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
