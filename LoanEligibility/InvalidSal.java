package LoanEligibility;

public class InvalidSal extends Exception{

	@Override
	public String toString() {
		return "Your Age is not valid for loan application";
	}

}
