import LoanEligibility.*;
public class EducationLoan extends LoanVar implements Loan{
     private String AdmStat;
     private String Nationality;
     private int age;
     
     
	


	public EducationLoan(String admStat, String nationality, int age) {
		super();
		AdmStat = admStat;
		Nationality = nationality;
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
		
		try{
			
			if(AdmStat!="confirmed")
				throw new AdmStatCon();	
			if(Nationality!="indian")
				throw new NatVerif();
			if(age<16||age>35)
				throw new InvaldAge();
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

}
