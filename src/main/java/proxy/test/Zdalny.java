import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Professional on 2018-01-26.
 */
public interface Zdalny extends Remote {
    public String powiedzHej() throws RemoteException;
}
