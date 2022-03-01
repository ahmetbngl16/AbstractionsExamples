
public class UserManager {
	
	public void login(Logger[] loggers) {
		System.out.println("Kullanýcý Giriþ Yaptý : ");
		for(Logger logger :loggers) {
			logger.log();
		}
	}

}
