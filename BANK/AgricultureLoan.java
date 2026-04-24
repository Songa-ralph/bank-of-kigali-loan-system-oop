package BANK;

public class AgricultureLoan extends LoanManager {
    private String farmType;

    // Constructors
    public AgricultureLoan() {
        super();
        this.setLoanType("Agriculture");
        this.setInterestRate(0.08); // 8% interest rate
    }

    public AgricultureLoan(String loanId, double loanAmount, int loanDuration, String officerName,
            String branchLocation,
            String farmType) {
        super(loanId, "Agriculture", loanAmount, 0.08, loanDuration, officerName, branchLocation); // Example: 8%
                                                                                                   // interest
        this.farmType = farmType;
    }

    public String getFarmType() {
        return farmType;
    }

    public void setFarmType(String farmType) {
        this.farmType = farmType;
    }

    // Override methods
    @Override
    public double calculateInterest() {
        return getLoanAmount() * getInterestRate() * (getLoanDuration() / 12.0);
    }

    @Override
    public boolean checkEligibility() {
        // Example eligibility: loan amount must be less than 100,000,000 RWF
        return getLoanAmount() < 100000000;
    }

    @Override
    public double calculateTotalRepayment() {
        return getLoanAmount() + calculateInterest();
    }

    @Override
    public String toString() {
        return super.toString() + "\nFarm Type: " + farmType;
    }

}
