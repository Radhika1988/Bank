package com.neoteric.bank1.service;

import com.neoteric.bank1.model.Bank;
import com.neoteric.bank1.model.OpenAccount;

import java.util.UUID;

public class BankService {
    public OpenAccount getaccount(Bank bankregform){

        OpenAccount openAccount=null;
        if (bankregform.age>18 && bankregform.age<60){


            openAccount=new OpenAccount();


            openAccount.accountNumber="branchcode"+ UUID.randomUUID().toString();
            openAccount.bankBranch="Hyderabad";
            openAccount.ifscCode="SBI37266328";
            openAccount.name="dabbfu";


        }



         return openAccount;
        }



}
