package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    private InputValidationService validationService;

    public Integer checkout(String skus) {

        Integer checkOut = 0;

        validationService = new InputValidationService();

        if(skus == null || skus.isEmpty()) {
            return 0;
        }

        if(!validationService.isValid(skus)) {
            return -1;
        }

        return checkOut;
    }


}





