
public class UserManager {
	
	public void login(Logger[] loggers) {
		System.out.println("Kullan�c� Giri� Yapt� : ");
		for(Logger logger :loggers) {
			logger.log();
		}
	}

}
