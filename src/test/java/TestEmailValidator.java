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

}
