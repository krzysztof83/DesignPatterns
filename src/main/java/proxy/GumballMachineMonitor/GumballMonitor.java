import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Professional on 2018-01-25.
 */
public class GumballMonitor {
    GumballMachineRemote gumballMachineForRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineForRemote) {
        this.gumballMachineForRemote = gumballMachineForRemote;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachineForRemote.getLocation());
            System.out.println("Current inventory: " + gumballMachineForRemote.getCount());
            System.out.println("Current state: " + gumballMachineForRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            GumballMachineRemote r = (GumballMachineRemote) Naming.lookup("Gliwice");
            GumballMonitor g = new GumballMonitor(r);
            g.report();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

}
