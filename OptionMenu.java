
/* main class */

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import java.util.Map.Entry;

public class OptionMenu extends Account {
    Scanner MenuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;

        do {
            try {
                data.put(98816612, 4232);
                data.put(96043769, 1728);
                data.put(96070790, 2004);

                System.out.println("Welcome to  the ATM project!");
                System.out.print("Enter your customer NUmber: ");
                SetCustomerNumber( MenuInput.nextInt());

                System.out.print("Enter the pin number: ");
                 SetPinNumber(MenuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid characters.only nuymber " + "/n");
                x = 2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
                    getAcooutnType();
                    break;
                }
            }
            System.out.println("\n" + "Wrong Customer NUmber or Pin Number." + "\n");
        } while (x == 1);
    }

    /* Account Type Menu with Selection */
    public void getAcooutnType() {
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1: Checking Acoount");
        System.out.println("Type 2 : Saving Account");
        System.out.println("Type 3 : Exit");
        System.out.println("choice: ");

        int select = MenuInput.nextInt();

        switch (select) {
            case 1:
                getchecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATM, BYE !.");
                break;
            default:
                System.out.println("Invalid choice:");
                getAcooutnType();
                break;
        }

    }

    public void getchecking() {
        System.out.println("Checking Account :");
        System.out.println("Type 1 : view Balance");
        System.out.println("Type 2 : withdrawal money");
        System.out.println("Type 3 : Deposite Funds");
        System.out.println("Exit");
        System.out.println("choices: ");

        int selection = MenuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("checking Account Balance :" + moneyFormat.format(getcheckingAccountBalance()));
                getAcooutnType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAcooutnType();
                break;
            case 3:
                getCheckingDepositInput();
                getAcooutnType();
                break;
            case 4:
                System.out.println("Thank you for using ATM BYE .");
                break;

            default:
                System.out.println("Invalid choice:");
                getchecking();
                break;
        }
    }

    public void getSaving() {
        System.out.println("Saving Account :");
        System.out.println("Type 1 : view Balance");
        System.out.println("Type 2 : withdrawal money");
        System.out.println("Type 3 : Deposite Funds");
        System.out.println("Exit");
        System.out.println("choices: ");

        int sel = MenuInput.nextInt();

        switch (sel) {
            case 1:
                System.out.println("checking Account Balance :" + moneyFormat.format(getCheckingSavingBalance()));
                getAcooutnType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAcooutnType();
                break;
            case 3:
                getSavingDepositInput();
                getAcooutnType();
                break;
            case 4:
                System.out.println("Thank you for using ATM BYE .");
                break;

            default:
                System.out.println("Invalid choice:");
                getSaving();
                break;
        }

    }
}