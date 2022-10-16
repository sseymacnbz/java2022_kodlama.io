package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// Polymorphism, çok biçimlilik demektir. Aralarında inheritance olması durumunda birbirinin referans tiplerini tutma durumudur
		
		EmailLogger logger_ = new EmailLogger();
		logger_.log("Log mesaji");
		
		System.out.println("##############################################################");

		// int[] sayilar = new int[]{2,3,4,"asdf} gibi bir array tanımı bize hata döner çünkü biz int olarak belirttik ve bir String girdik.
		// Bundan yola çıkarak, aşağıdaki tanımlamada hata almamamızın sebebi File,Email ve Database Logger Class'larının aslında birer BaseLogger olmasındandır
		BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		
		// Yani biz bu sayede İlgili loglama alanlarına tek tek uğraşmadan loglama yaptık
		for (BaseLogger logger: loggers) {
			logger.log("Log mesaji");
		}
		
		// Bu for çalıştığında göreceksin ki her bir class'a loglama mesajlarımız gönderilmiş.
		// Biz yukarda ihtiyaçlarımızıa göre misal FileLogger'ı çıkartıp başka bir class'ı sokabiliriz.
		
		
		// ASIL POLYMORPHISM BURADA BAŞLIYOR
		// Biz yukarıdaki kullanımdan ziyade gerçek hayat düşünüldüğünde CustomerManager'daki işlemlerimiz sonucu tutulmasını istediğimiz bir Log kaydı için bu şekilde bir kullanım yaparız
		System.out.println("##############################################################");
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
