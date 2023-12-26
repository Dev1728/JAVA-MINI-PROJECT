
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Account {
    Scanner Input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
    /* Set the Customer Number */

    public void SetCustomerNumber(int CustomerNumber) {
        this.CustomerNumber = CustomerNumber;
    }

    /* get the Customer Number */
    public int getCustomerNumber() {
        return CustomerNumber;
    }

    /* Set the Customer Pin Number */

    public void SetPinNumber(int pin) {
        this.pin = pin;
    }

    /* Get the Customer Pin Number */

    public int getPinNumber() {
        return pin;
    }

    /* get checking Account Balance */

    public double getcheckingAccountBalance() {
        return CheckingBalance;
    }

    /* Get Saving Account Balance */

    public double getCheckingSavingBalance() {
        return SavingBalance;
    }
    /* Calculate Checking Account withdrawal */

    public double calcCheckingWithdraw(double amount) {
        CheckingBalance = (CheckingBalance - amount);
        return CheckingBalance;
    }
    /* Calculate Saving Account Balance */

    public double calSavingBalance(double amount) {
        SavingBalance = (SavingBalance - amount);
        return SavingBalance;
    }

    /* Caculate Checking acoount Deposit */
    public double calCheckingDeposit(double amount) {
        CheckingBalance = CheckingBalance + amount;
        return CheckingBalance;
    }

    /* calculate Saving Account Deposite */
    public double calSavingDeposit(double amount) {
        SavingBalance = (SavingBalance + amount);
        return SavingBalance;
    }

    /* customer Checking Account WithDraw Input */

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance :" + moneyFormat.format(CheckingBalance));
        System.out.println("Amount you want to withdraw from checking acount :");
        double amount = Input.nextDouble();

        if ((CheckingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance :" + moneyFormat.format(CheckingBalance));
        } else {
            System.out.println("Balance cannot be negative" + "\n");
        }
    }

    /* customer Saving ACCOUNT withdraw input */
    public void getSavingWithdrawInput() {
        System.out.println("Saving account Balance :" + moneyFormat.format(SavingBalance));
        System.out.print("Account you want to wihtdraw from saving account :");
        double amount = Input.nextDouble();

        if ((SavingBalance - amount) >= 0) {
            calSavingBalance(amount);
            System.out.println("New Saving Balance :" + moneyFormat.format(SavingBalance));
        } else {
            System.out.println("Balance cannot be negative " + "\n");
        }
    }

    /* Customer Checking Account Deposit input */
    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance :" + moneyFormat.format(CheckingBalance));
        System.out.println("Amount you want to Deposit in checking acount :");
        double amount = Input.nextDouble();

        if ((CheckingBalance + amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance :" + moneyFormat.format(CheckingBalance));
        } else {
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
    /* Customer Saving Balance Deposite Input */

    public void getSavingDepositInput() {
        System.out.println("Saving account Balance :" + moneyFormat.format(SavingBalance));
        System.out.print("Account you want to Deposit in saving account :");
        double amount = Input.nextDouble();

        if ((SavingBalance + amount) >= 0) {
            calSavingBalance(amount);
            System.out.println("New Saving Balance :" + moneyFormat.format(SavingBalance));
        } else {
            System.out.println("Balance cannot be negative " + "\n");
        }
    }

    private int CustomerNumber;
    private int pin;
    private double CheckingBalance = 0;
    private double SavingBalance = 0;
}
