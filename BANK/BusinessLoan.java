package BANK;

public class BusinessLoan extends LoanManager {

    private String businessRegistrationNumber;

    // Constructors
    public BusinessLoan() {
        super();
        this.setLoanType("Business");
        this.setInterestRate(0.20); // 20% interest rate
    }

    public BusinessLoan(String loanId, double loanAmount, int loanDuration, String officerName, String branchLocation,
            String businessRegistrationNumber) {
        super(loanId, "Business", loanAmount, 0.20, loanDuration, officerName, branchLocation); // Example: 20% interest
        this.businessRegistrationNumber = businessRegistrationNumber;
    }

    public String getBusinessRegistrationNumber() {
        return businessRegistrationNumber;
    }

    public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
        this.businessRegistrationNumber = businessRegistrationNumber;
    }

    // Override methods
    @Override
    public double calculateInterest() {
        // Simple interest calculation: P * R * T
        return getLoanAmount() * getInterestRate() * (getLoanDuration() / 12.0);
    }

    @Override
    public boolean checkEligibility() {
        // Example eligibility: loan amount must be less than 500,000,000 RWF
        return getLoanAmount() < 500000000;
    }

    @Override
    public double calculateTotalRepayment() {
        return getLoanAmount() + calculateInterest();
    }

    @Override
    public String toString() {
        return super.toString() + "\nBusiness Registration Number: " + businessRegistrationNumber;
    }

}
