public class EmailValidator {
	
	public boolean validate(String address){
		
		if(address.contains(".") && address.contains("@")){
			
			return true;
		}
		
		else{
			
			return false;
		}
		
	}

}
