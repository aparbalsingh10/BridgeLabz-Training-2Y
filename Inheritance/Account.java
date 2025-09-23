class Account {
    public final void showAccountType() {
        System.out.println("This is a generic account");
    }

    public void deposit() {
        System.out.println("Depositing money");
    }
}

class SavingsAccount extends Account {
    @Override
    public void deposit() {
        System.out.println("Depositing in Savings Account");
    }
}
