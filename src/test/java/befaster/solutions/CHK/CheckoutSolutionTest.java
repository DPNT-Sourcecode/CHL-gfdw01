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

	@Test
	public void givenTwoBProductsWhenCheckoutThenShowResult() {

		Integer checkout = checkoutSolution.checkout("BB");

		MatcherAssert.assertThat(checkout, CoreMatchers.equalTo(45));
	}

	@Test
	public void givenNewProductEWhenCheckOutThenShowResult() {
		Integer checkout = checkoutSolution.checkout("E");

		MatcherAssert.assertThat(checkout,CoreMatchers.equalTo(40));
	}

	@Test
	public void givenNewProductEAndBWhenCheckOutThenShowResult() {
		Integer checkout = checkoutSolution.checkout("EB");

		MatcherAssert.assertThat(checkout,CoreMatchers.equalTo(70));
	}

	@Test
	public void givenFreeProductRuleWhenCheckOutThenShowResult() {
		Integer checkout = checkoutSolution.checkout("EEB");

		MatcherAssert.assertThat(checkout,CoreMatchers.equalTo(80));
	}

	@Test
	public void givenBetterPromotionRuleWhenCheckOutThenShowResult() {

		Integer checkout = checkoutSolution.checkout("AAAAAAAABA");

		MatcherAssert.assertThat(checkout,CoreMatchers.equalTo(410));

	}
}

