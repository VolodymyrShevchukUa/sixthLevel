package com.shpp.smells.Divergent;

public class Account {

    public static final int INT = 500;
    private String type;
    private String accountNumber;
    private int amount;

    public Account(String type,String accountNumber,int amount)
    {
        this.amount=amount;
        this.type=type;
        this.accountNumber=accountNumber;
    }


    public void debit(int debit) throws Exception
    {
        if(isValid(amount))
        {
            throw new Exception("Mininum balance shuold be over 500");
        }

        amount = amount-debit;
        System.out.println("Now amount is" + amount);

    }

    private boolean isValid(int amount) {
        return amount <= INT;
    }

    public void transfer(Account from,Account to,int cerditAmount) throws Exception
    {
        if(isValid(from.amount))
        {
            throw new Exception("Mininum balance shuold be over 500");
        }

        to.amount = amount+cerditAmount;

    }

    public void sendWarningMessage()
    {
        if(isValid(amount))
        {
            System.out.println("amount should be over 500");
        }
    }
}
