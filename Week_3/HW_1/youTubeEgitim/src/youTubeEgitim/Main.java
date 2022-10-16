package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		
		// REFERANS TİPLERİ ANLAMAK
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		
		System.out.println(sayi1); // Çıktı 'dir
		
		// Stack ve Heap adlı 2 belleğimiz vardır
		// int, stack bölümünde işlem görür. Sayısal tipler değer tiplidir. Stack'de tutulur
		// Stack'de atama olarak işlem yapılır
		
		/* **************************** */
		
		int[] sayilar1 = {1, 2, 3};
		int[] sayilar2 = {10, 20, 30};
		
		sayilar1 = sayilar2;
				
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]); // Çıktı 1000 our
		
		// Array'ler birer değer tiptir.
		// Bir sayilar1 array'i oluşturduğumuzda Stack'te array'in adresi tutulurken
		// heap'te de aynı adreste array değerleri atanır
		// Biz sayilar1 = sayilar2 dediğimizde sayilar1'in refereansını (adresini) atamış oluyoruz aslında. Değerleri değil
		// Bu sebeple yukarıda sayilar1 ve sayilar2'nin adreslerini eşitledik. Bu sayede sayilar1[0] 1000 çıktı.
		
		
		
		// CLASS
		
		// Class Nedir? : İçerisinde yapacağımız işlemleri veya herhangi bir konudaki bilgileri tutan yapılardır
		
		
		CreditManager creditManager = new CreditManager(); // Biz new'lediğimiz anda belleğin heap kısmında bir referans oluştu. New'leyince öyle olur
		creditManager.calculate();
		creditManager.save();
		
		
		
		Customer customer = new Customer();
		customer.id = 1;
		//customer.firstName = "Seyma";
		//customer.lastName = "Canbaz";
		
		
		
		// Doğru bir şekilde gönderme işlemi
		// customer için bir parametre daha eklenecek olursa bu haliyle hata vermeyecektir
		/*CustomerManager customerManager = new CustomerManager();
		 * customerManager.save(customer); CustomerManager içerisinde constructor oluşturmasaydık böyle bir kullanım yapabilirdik*/
		
		/*CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();*/
		
		
		// Customer customer dediğimizde Customer tipinde customer değişkeni Stack'de oluşur
		// Bunu new'lediğimizde customer'ın aynı adresinde heap'de customer'a ait bilgiler saklanır
		
		
		
		// CONSTRUCTOR'LAR
		
		// Kelime anlamı olarak yapıcı blok demektir.
		// Customer ve CustomerManager Class'larının içerisinde örneği görebilirsin.
		
		
		// INHERITANCE
		// Person ve Company Class'ları Customer Class'ından miras aldı.
		Company company = new Company();
		company.taxNumber = "1234";
		company.companyName = "Vestel";
		company.id = 100;
		
		/*CustomerManager customerManager2 = new CustomerManager(company); // Inheritance sayesinde company olarak verdiğimizde sıkıntı çıkarmadı*/
		// Inheritance bir refereans tiptir. Böylece biz bu işlemi sorunsuz yapabiliyoruz
		
		Person person = new Person();
		person.nationalIdentitiy = "54364342";
		
		// INTERFACE'LER MAIN2'DE ELE ALINDI

	}

}
