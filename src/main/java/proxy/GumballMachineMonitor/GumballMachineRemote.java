import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Professional on 2018-01-26.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public StateForRemote getState() throws RemoteException;
}
