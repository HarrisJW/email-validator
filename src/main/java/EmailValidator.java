public class EmailValidator {
	
	//A class for validating email addresses.
	
	public boolean validate(String address){
		
		if(address.contains(".") && address.contains("@") && !(address.contains(" ")) && (address.length() <254)){
			
			return true;
		}
		
		else{
			
			return false;
		}
		
	}

}
