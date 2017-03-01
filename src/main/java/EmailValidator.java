public class EmailValidator {
	
	//A class for validating email addresses.
	
	public boolean validate(String address){
		
		// 254 characters
		// Syntax. The format of email addresses is local-part@domain where the local part may be up to 64 characters
		// long and the domain may have a maximum of 255 characters—but the maximum of 256-character length of a forward 
		// or reverse path restricts the entire email address to be no more than 254 characters long.
		// Email address - Wikipedia
		// https://en.wikipedia.org/wiki/Email_address
		
		System.out.println(address.length());
		
		// Email addresses must contain a dot and an @ symbol,
		// and cannot contain spaces or more than 254 characters.
		if(address.contains(".") && address.contains("@")  && !(address.contains(" ")) && (address.length() < 255)){
			
			return true;
		}
		
		else{
			
			return false;
		}
		
	}

}
