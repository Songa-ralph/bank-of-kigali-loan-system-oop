package BANK;

public class StudentLoan extends LoanManager {
    private String universityName;

    // 2. Constructors
    public StudentLoan() {
        super();
        this.setLoanType("Student");
        this.setInterestRate(0.05); // 5% interest rate
    }

    public StudentLoan(String loanId, double loanAmount, int loanDuration, String officerName, String branchLocation,
            String universityName) {
        super(loanId, "Student", loanAmount, 0.05, loanDuration, officerName, branchLocation); // Example: 5% interest
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    // 3. Override methods
    @Override
    public double calculateInterest() {
        // Simple interest calculation: P * R * T
        return getLoanAmount() * getInterestRate() * (getLoanDuration() / 12.0);
    }

    @Override
    public boolean checkEligibility() {
        // Example eligibility: loan amount must be less than 10,000,000 RWF
        return getLoanAmount() < 10000000;
    }

    @Override
    public double calculateTotalRepayment() {
        return getLoanAmount() + calculateInterest();
    }

    // 4. Override toString()
    @Override
    public String toString() {
        return super.toString() + "\nUniversity Name: " + universityName;
    }

}
