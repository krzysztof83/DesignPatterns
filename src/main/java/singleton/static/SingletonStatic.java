

public class SingletonStatic {
	private static SingletonStatic uniqueInstance = new SingletonStatic();
 
	private SingletonStatic() {}
 
	public static SingletonStatic getInstance() {
		return uniqueInstance;
	}
}
