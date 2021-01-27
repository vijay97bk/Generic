package genericpractice1;

import org.junit.Assert;
import org.junit.Test;

public class MaximumcheckTest {

	// test to check if maximum value is at first position.
	@Test
	public void MaximumValueAtFirstPosition() {
		Maximumcheck maximumCheck = new Maximumcheck();
	   String maximum = maximumCheck.maximumValue("Apple", "Peach", "Banana");
		Assert.assertEquals("Apple", maximum);
	}

	// test to check if maximum value is at second position.
	@Test
	public void MaximumValueAtSecondPosition() {
		Maximumcheck maximumCheck = new Maximumcheck();
		String maximum = maximumCheck.maximumValue("Peach", "Apple", "Banana");
		Assert.assertEquals("Apple", maximum);
	}

	// test to check if maximum value is at third position.
	@Test
	public void MaximumValueAtThirdPosition() {
		Maximumcheck maximumCheck = new Maximumcheck();
		String maximum = maximumCheck.maximumValue("Banana", "Peach", "Apple");
		Assert.assertEquals("Apple", maximum);
	}
}
	
	

