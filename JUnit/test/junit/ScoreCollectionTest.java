package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ScoreCollectionTest {

	@Test
	public void answerArithmeticMeanOfTwoNumbers() {
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);
		
		int actualResult = collection.arithmeticMean();
		
		assertThat(actualResult, equalTo(6));
		
	}

}
