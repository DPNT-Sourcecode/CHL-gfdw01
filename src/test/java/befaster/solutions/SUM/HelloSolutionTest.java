package befaster.solutions.SUM;

import befaster.solutions.HLO.HelloSolution;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


/**
 * Test class for {@link befaster.solutions.HLO.HelloSolution}
 *
 * @author acozma
 */
public class HelloSolutionTest {

	private HelloSolution helloSolution;

	@Before
	public void setUp() {

		helloSolution = new HelloSolution();
	}

	@Test
	public void givenGivenCorrectMessageWhenRunningHelloThenSuccess() {

		String message = helloSolution.hello("Alex");
		MatcherAssert.assertThat(message,equalTo("Hello, World!"));
	}
}
