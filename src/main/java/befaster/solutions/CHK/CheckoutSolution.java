package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    public Integer checkout(String skus) {

        if(skus == null || skus.isEmpty()) {
            return 0;
        }

        if(skus.equals("A"))
        return 50;
    }
}




