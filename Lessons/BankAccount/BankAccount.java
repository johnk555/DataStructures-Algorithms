class BankAccount {
    private String fullName;
    private String bankAccountNo;
    private double balance;
    private int yearsActive;

    BankAccount(String fullName, String bankAccountNo, double balance, int yearsActive) {
        this.fullName = fullName;
        this.balance = balance;
        this.yearsActive = yearsActive;
        this.bankAccountNo = bankAccountNo;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setActiveYears(int yearsActive) {
        this.yearsActive = yearsActive;
    }

    public String getFullName() {
        return fullName;
    }
    public double getBalance() {
        return balance;
    }
    public int getActiveYears() {
        return yearsActive;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void print() {
        System.out.println("Full Name           : " + fullName);
        System.out.println("Bank Account Number : " + bankAccountNo);
        System.out.println("Active Years        : " + yearsActive);
        System.out.println("Balance             : " + balance);
    }
}
