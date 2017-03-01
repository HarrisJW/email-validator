import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmailValidator {
	
	public EmailValidator getValidator(){
		
		return new EmailValidator();
	
	}

	@Test
	public void testEmailValidatorRejectsNoAtSymbol() {
		EmailValidator validator = getValidator();
		boolean result = validator.validate("TestWithNoAtSymbol.com");
		assertFalse(result);
	}
	
	@Test
	public void testEmailValidatorRejectsNoPeriod() {
		EmailValidator validator = getValidator();
		boolean result = validator.validate("TestWithNoAtSymbol@emailcom");
		assertFalse(result);
	}
	
	@Test
	public void testEmailValidatorAcceptsAddressWithPeriodAndAtSymbol() {
		EmailValidator validator = getValidator();
		boolean result = validator.validate("TestAddress@email.com");
		assertTrue(result);
	}
	
	@Test
	public void testEmailValidatorRejectsAddressWithSpace() {
		EmailValidator validator = getValidator();
		boolean result = validator.validate("TestAddress @email.com");
		assertFalse(result);
	}
	
	@Test
	public void testEmailValidatorRejectsAddressWith254Characters() {
		EmailValidator validator = getValidator();
		boolean result = validator.validate(""
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789" //100 chars
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789" //200 chars
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789"
				+ "0123456789" // 250 chars
				+ "@1.2"); //254 chars
		assertFalse(result);
	}
	
	

}
