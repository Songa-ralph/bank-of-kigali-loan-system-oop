package BANK;

public class CarLoan extends LoanManager {
    private String vehicleModel;

    // Constructors
    public CarLoan() {
        super();
        this.setLoanType("Car");
        this.setInterestRate(0.15); // 15% interest rate
    }

    public CarLoan(String loanId, double loanAmount, int loanDuration, String officerName, String branchLocation,
            String vehicleModel) {
        super(loanId, "Car", loanAmount, 0.15, loanDuration, officerName, branchLocation); // Example: 15% interest
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    // Override methods
    @Override
    public double calculateInterest() {
        return getLoanAmount() * getInterestRate() * (getLoanDuration() / 12.0);
    }

    @Override
    public boolean checkEligibility() {
        // Example eligibility: loan amount must be less than 30,000,000 RWF
        return getLoanAmount() < 30000000;
    }

    @Override
    public double calculateTotalRepayment() {
        return getLoanAmount() + calculateInterest();
    }

    @Override
    public String toString() {
        return super.toString() + "\nVehicle Model: " + vehicleModel;
    }

}
