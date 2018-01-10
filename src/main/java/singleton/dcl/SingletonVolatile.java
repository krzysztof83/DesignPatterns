
//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class SingletonVolatile {
	private volatile static SingletonVolatile uniqueInstance;
 
	private SingletonVolatile() {}
 
	public static SingletonVolatile getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonVolatile();
				}
			}
		}
		return uniqueInstance;
	}
}
