import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Professional on 2018-01-26.
 */
public class ZdalnyKlient {
    public static void main(String[] args) {
        new ZdalnyKlient().go();
    }

    public void go(){

        try {
            Zdalny usluga = (Zdalny) Naming.lookup("rmi://127.0.0.1/ZdalneHej");
            String s = usluga.powiedzHej();
            System.out.println(s);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
