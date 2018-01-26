import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineForRemote extends UnicastRemoteObject implements GumballMachineRemote {
	StateForRemote soldOutState;
	StateForRemote noQuarterState;
	StateForRemote hasQuarterState;
	StateForRemote soldState;
	StateForRemote winnerState;
 
	StateForRemote state = soldOutState;
	int count = 0;
 	String location;
 
	public GumballMachineForRemote(String location, int count) throws RemoteException{
		soldOutState = new SoldOutStateForRemote(this);
		noQuarterState = new NoQuarterStateForRemote(this);
		hasQuarterState = new HasQuarterStateForRemote(this);
		soldState = new SoldStateForRemote(this);
		winnerState = new WinnerStateForRemote(this);

		this.count = count;
 		if (count > 0) {
			state = noQuarterState;
		} 
		this.location = location;
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(StateForRemote state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	public int getCount() {
		return count;
	}

	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public StateForRemote getState() {
        return state;
    }
 
    public String getLocation() {
        return location;
    }
 
    public StateForRemote getSoldOutState() {
        return soldOutState;
    }

    public StateForRemote getNoQuarterState() {
        return noQuarterState;
    }

    public StateForRemote getHasQuarterState() {
        return hasQuarterState;
    }

    public StateForRemote getSoldState() {
        return soldState;
    }

    public StateForRemote getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

	public static void main(String[] args) {
		try {
			int count = Integer.parseInt(args[1]);
			System.out.println(count);
			System.out.println(args[0]);
			GumballMachineRemote usluga = new GumballMachineForRemote(args[0],count);
			Naming.rebind(args[0],usluga);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
