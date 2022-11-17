import java.util.Scanner;

class BankAccount
{
    int accNo;
    double balance;

    BankAccount()
    {
        accNo=125;
        balance=15000;
    }

    double withdraw(double amount)
    {
        balance -=amount;
        return balance;
    }
    double deposit(double amount)
    {
        balance +=amount;
        return balance;
    }
    void show()
    {
        System.out.println("Account number is: "+accNo+" and Balance: "+balance);
    }

}

public class Bank {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to Withdraw");
        double amount= sc.nextDouble();
        try
        {
            if(amount > b.balance)
            {
                throw new Exception("Sorry your balance is low");
            }

            b.withdraw(amount);
            b.show();
        }

        catch(Exception e)
        {
            System.out.println("Invalid withdrawal ammount Exception occured");

        }

        System.out.println("Enter the amount to Deposit");
        double amount1= sc.nextDouble();
        b.deposit(amount1);
        b.show();


    }
}
