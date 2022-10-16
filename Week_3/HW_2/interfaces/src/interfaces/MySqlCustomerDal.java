package interfaces;
// Class'lar birden fazla interface'i implemente edebilir
public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("My Sql'e eklendi");
		
	}

}
