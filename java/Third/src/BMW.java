
public class BMW implements AutoMobile,AutomobileWithAbs {
     
	@Override
	public int gear() {
		System.out.println("gear method of bmw");
		return 10;
	}

	@Override
	public void gps() {
		System.out.println("gps() method bmw");
		
	}

	@Override
	public void abs() {
		System.out.println("abs() of BMW");
		
	}
	

}
