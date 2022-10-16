package interfaces;

public class Main {

	public static void main(String[] args) {
		// Bir class birden fazla interface'i uygulayabilir.
		// Interface'ler de newlenemez. Yani new'lenir ama aşağıdaki gibi saçma bişi olur
		// add ı ide kendi kednine ekledi newleme yaptığımızda
		
		/*
		ICustomerDal customerDal = new ICustomerDal() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}
		};
		*/
		
		//////////////////////////////////////////////////////
		
		/*
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
		*/
		// Yukarıdaki şekildeki kullanım doğrudur. Lakin 2 satırdaki kısmı
		// atlamamız durumunda program çalıştırılana kadar hata vermeyecektir
		// Öyle bir şey yapalım ki bunun önüne geçelim
	}

}
