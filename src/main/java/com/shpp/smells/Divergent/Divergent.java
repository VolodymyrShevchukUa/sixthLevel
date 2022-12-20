package com.shpp.smells.Divergent;

public class Divergent {

    public static void main(String[] args) throws Exception {
        Account acc = new Account("Personal","AC1234",1000);
        acc.debit(500);
        acc.sendWarningMessage();
        //acc.debit(500);
    }

}
