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

		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(0));
	}

	@Test
	public void givenNotValidInputWhenCheckoutThenShowResult() {

		Integer checkout = checkoutSolution.checkout("a");

		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(-1));
	}

	@Test
	public void givenProductAWhenCheckoutThenShowResult(){

		Integer checkout = checkoutSolution.checkout("A");

		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(50));
	}

	@Test
	public void givenProductBWhenCheckOutThenShowResult() {

		Integer checkout = checkoutSolution.checkout("B");
		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(30));
	}

	@Test
	public void givenProductCWhenCheckOutThenShowResult() {

		Integer checkout = checkoutSolution.checkout("C");
		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(20));
	}

	@Test
	public void givenProductDWhenCheckOutThenShowResult() {

		Integer checkout = checkoutSolution.checkout("D");
		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(15));
	}

	@Test
	public void givenCombinedProductsWhenCheckOutThenShowResult() {
		Integer checkout = checkoutSolution.checkout("ABCD");
		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(115));
	}

	@Test
	public void givenTwoAProductsWhenCheckoutThenShowResult() {
		Integer checkout = checkoutSolution.checkout("AA");
		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(100));
	}

	@Test
	public void givenThreeAProductsWhenCheckoutThenShowResult() {
		Integer checkout = checkoutSolution.checkout("AAA");
		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(130));
	}
}
