import LoanEligibility.*;
public class HomeLoan extends LoanVar implements Loan {
    
	private int CibilSc;
	private int age;
    
	public HomeLoan(int cibilSc, int age) {
		super();
		CibilSc = cibilSc;
		this.age = age;
	}
	


	public int getLid() {
		return Lid;
	}



	public void setLid(int lid) {
		Lid = lid;
	}



	public double getIntRate() {
		return IntRate;
	}



	public void setIntRate(double intRate) {
		IntRate = intRate;
	}



	public double getLoanAmt() {
		return LoanAmt;
	}



	public void setLoanAmt(double loanAmt) {
		LoanAmt = loanAmt;
	}



	public double getIntCost() {
		return IntCost;
	}



	public void setIntCost(double intCost) {
		IntCost = intCost;
	}



	public double getPayback() {
		return payback;
	}



	public void setPayback(double payback) {
		this.payback = payback;
	}



	public void CheckEligibility() {
		// TODO Auto-generated method stub
		try{
			if(age<24 || age>60)
				throw new InvalidAge();
			if(CibilSc <750 || CibilSc >900)
				throw new CibilCheck();
			System.out.println("Congrats!! Your Home Loan Is Granted.");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("OOps Sorry!! it seems you are not eligible for loan application");
		}
		finally
		{
			System.out.println("Thank You For Visiting Loan Section..!!\n");
		}
	
		
		
	}
	

}
