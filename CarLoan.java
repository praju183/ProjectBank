import LoanEligibility.CibilCheck;
import LoanEligibility.*;

public class CarLoan extends LoanVar implements Loan {
	
	private int CblSc;
	private int Sal;
	private int Age;
	
	
	public CarLoan(int cblSc, int sal, int age) {
		super();
		CblSc = cblSc;
		Sal = sal;
		Age = age;
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

	@Override
	public void CheckEligibility() {
		try{
			if(Age<24 || Age>60)
				throw new InvalidAge();
			if(CblSc <750 || CblSc >900)
				throw new CibilCheck();
			if(Sal<20000)
				throw new InvalidSal();
			System.out.println("Congrats!! Your Education Loan Is Granted.");
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
		// TODO Auto-generated method stub
		
	}
	