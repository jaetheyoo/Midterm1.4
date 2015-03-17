

import static org.junit.Assert.*;
import org.junit.Test;

public class MyClassJUnitTest {

	@Test
	public void testReturnTrue() {
		assertEquals("Expected true, but returned false;", true, MyClass.ReturnTrue());
	}
	
	@Test
	public void testAddTwoNbrs() {
		int answer = MyClass.AddTwoNumbers(1, 2);
		assertEquals("Expected 1+2 = 3, but got n!=3;", 3, answer);
	}
}