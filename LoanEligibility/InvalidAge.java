package LoanEligibility;
public class InvalidAge extends Exception {
	
       public String toString(){
    	   return "Invalid Age <24 || >60";
       }
}
