package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Test class which verifies {@link SumSolution}
 */
public class SumSolutionTest {

    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void givenTwoOperandsWhenCalculatingSumThenReturnCorrectResult() {

        int sum = this.sum.add(1, 1);

        assertThat(sum, equalTo(2));
    }

    @Test
    public void givenMinimumValuesWhenCalculatingSumThenReturnCorrectResult() {

        int sum = this.sum.add(0,0);

        assertThat(sum,equalTo(0));
    }

    @Test
    public void givenMaximumValuesWhenCalculatingSumThenReturnCorrectResult() {

        int sum = this.sum.add(100,100);

        assertThat(sum,equalTo(200));
    }
}

