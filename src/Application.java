public class Application {
    public static void main(String[] args) {
        int i;

        //Declare and initialize saver1 and saver2 balances, store in SavingsAccount
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        //Calculate balance's each month with a 4% interest rate
        SavingsAccount.modifyInterestRate(.04);
        {

            //Saver1
            System.out.println("Saver1");

            //Calculate new balance after interest for 12 months
            for (i = 0; i < 12; ++i) {
                saver1.calculateMonthlyInterest();
                System.out.print("Month " + (i + 1) + ": ");
                saver1.newBalance();
                System.out.println();
            }

            //Saver2
            System.out.println("\n\nSaver2");

            //Calculate new balance after interest for 12 months
            for (i = 0; i < 12; ++i) {
                saver2.calculateMonthlyInterest();
                System.out.print("Month" + (i + 1) + ": ");
                saver2.newBalance();
                System.out.println();
            }
        }

        //Change interest rate to 5%
        SavingsAccount.modifyInterestRate(.05);{

            System.out.println("\n\nInterest rate for the next month is 5%");
            System.out.println("\t\t\t Saver1\t\t Saver2");
            System.out.print("Month 13 : ");
            saver1.calculateMonthlyInterest();
            saver1.newBalance();
            System.out.print("\t\t");
            saver2.calculateMonthlyInterest();
            saver2.newBalance();
            System.out.println();
            }

        }

    }

