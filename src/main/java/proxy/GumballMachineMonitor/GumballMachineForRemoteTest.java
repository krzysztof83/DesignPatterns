import java.rmi.Naming;

/**
 * Created by Professional on 2018-01-26.
 */
public class GumballMachineForRemoteTest {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            System.out.println(count);
            System.out.println(args[0]);
            gumballMachineRemote = new GumballMachineForRemote(args[0], count);
            Naming.rebind("//"+args[0]+"/GumballMachineRemote",gumballMachineRemote);
//            Naming.rebind("//"+127.0.0+"/GumballMachineRemote",gumballMachineRemote);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
//        GumballMachineForRemote gumballMachine = new GumballMachineForRemote(args[0], count);
//
//        GumballMonitor monitor = new GumballMonitor(gumballMachine);
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        monitor.report();
    }
}
