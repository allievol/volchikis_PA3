public class SavingsAccount {

    public static double annualInterestRate = 0;
    private double savingsBalance;

    //Store saver1 and saver2 balances
    public SavingsAccount(double balance){
       this.savingsBalance = balance;
   }

   //Calculate monthly interest
    public double calculateMonthlyInterest(){
        double monthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance = savingsBalance + monthlyInterest;
        return monthlyInterest;
    }

    //Modify interest rate
    public static double modifyInterestRate(double newPercentage){
        annualInterestRate = newPercentage;
        return annualInterestRate;
    }

    //Calculate new balance after interest rate has been applied and return new value
    public double newBalance(){
        System.out.printf("$%.2f",savingsBalance);
        return savingsBalance;
    }


}
