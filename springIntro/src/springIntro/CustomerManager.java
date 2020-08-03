package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	//constructor injection
	//public CustomerManager(ICustomerDal customerDal) {
		
		//this.customerDal = customerDal;
	//}

	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//iş kuralları geçti mi geçtiyse veri erişimini çağır yaptık.
		//CustomerDal customerDal=new CustomerDal();
		customerDal.add();
	}
	
}
