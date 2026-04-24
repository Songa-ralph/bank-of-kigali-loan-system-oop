package BANK;

public class LoanFactory {
    /**
     * Creates and returns a Loan object based on the specified type.
     * This demonstrates the Factory Pattern and Polymorphism.
     * 
     * @param loanType The type of loan to create (e.g., "PERSONAL", "HOME").
     * @return A new Loan object of the specified type, or null if the type is
     *         invalid.
     */
    public static Loan createLoan(String loanType) {
        if (loanType == null || loanType.trim().isEmpty()) {
            return null;
        }

        // Use a switch statement for clean and readable object creation
        switch (loanType.toUpperCase()) {
            case "PERSONAL":
                return new PersonalLoan();
            case "HOME":
                return new HomeLoan();
            case "CAR":
                return new CarLoan();
            case "BUSINESS":
                return new BusinessLoan();
            case "STUDENT":
                return new StudentLoan();
            case "AGRICULTURE":
                return new AgricultureLoan();
            default:
                // Handle invalid loan types gracefully
                System.out.println("Error: Invalid loan type '" + loanType + "' specified.");
                return null;
        }
    }
}
