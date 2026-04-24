package BANK;

public class PersonalLoan extends LoanManager {
    // 1. Specific attribute for PersonalLoan
    private String purpose;

    // 2. Constructors
    public PersonalLoan() {
        super();
        this.setLoanType("Personal");
        this.setInterestRate(0.18); // 18% interest rate
    }

    public PersonalLoan(String loanId, double loanAmount, int loanDuration, String officerName, String branchLocation,
            String purpose) {
        super(loanId, "Personal", loanAmount, 0.18, loanDuration, officerName, branchLocation); // Example: 18% interest
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    // 3. Override at least 3 methods
    @Override
    public double calculateInterest() {
        // Simple interest calculation: P * R * T
        return getLoanAmount() * getInterestRate() * (getLoanDuration() / 12.0);
    }

    @Override
    public boolean checkEligibility() {
        // Example eligibility: loan amount must be less than 50,000,000 RWF
        return getLoanAmount() < 50000000;
    }

    @Override
    public double calculateTotalRepayment() {
        return getLoanAmount() + calculateInterest();
    }

    // 4. Override toString()
    @Override
    public String toString() {
        return super.toString() + "\nLoan Purpose: " + purpose;
    }
}