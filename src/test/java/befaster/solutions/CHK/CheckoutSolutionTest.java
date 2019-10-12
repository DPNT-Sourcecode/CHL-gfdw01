package befaster.solutions.CHK;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link CheckoutSolution}
 *
 * @author acozma
 */
public class CheckoutSolutionTest {

	private CheckoutSolution checkoutSolution;

	@Before
	public void setUp() {
		checkoutSolution = new CheckoutSolution();
	}

	@Test
	public void givenEmptyInputWhenCheckoutThenShowResult(){

		Integer checkout = checkoutSolution.checkout("");

		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(-1));
	}
}

