
public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager();
		DatabaseLogger databaseLogger=new DatabaseLogger();
		SmsLogger smsLogger=new SmsLogger();
		Logger[] ogretmenLogger= {databaseLogger};
		Logger[] ogrenciLogger= {databaseLogger,smsLogger};
		
		System.out.println("===============��RETMEN G�R�� YAPTI�INDA================");
		userManager.login(ogretmenLogger);
		System.out.println("===============��RENC� G�R�� YAPTI�INDA================");
        userManager.login(ogrenciLogger);
	}

}
