package JavaTraining;

public class Interface_SBIBankClass implements Interface_RBIRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface_RBIRules rbiRules = new Interface_SBIBankClass();
		rbiRules.calculateInterest();
		rbiRules.giveLoan();
		rbiRules.openFD();

	}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
		//int interestRate = 5;
		System.out.println("Calculate Interest SBI");
		
	}

	@Override
	public void giveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Give Loan SBI");
		
	}

	@Override
	public void openFD() {
		// TODO Auto-generated method stub
		System.out.println("Open FD SBI");
		
	}

}
