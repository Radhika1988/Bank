package com.neoteric.bank1;


import com.neoteric.bank1.model.Bank;
import com.neoteric.bank1.model.OpenAccount;
import com.neoteric.bank1.service.BankService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BankTest {

    @Test
    public void bankForm(){
        Bank bankregform = new Bank();
        bankregform.firstName="Mani";
        bankregform.lastName="dsbcb";
        bankregform.age=22;
        bankregform.dob="10-20-1999";
        bankregform.accountType="Saving";
        bankregform.adharNumber="1424341421";
        bankregform.panNumber="dsa1e314";
        bankregform.branchName="Hyd";
        bankregform.phoneNumber=993423453;

        BankService service = new BankService();
        service.getaccount(bankregform);

        OpenAccount openAccount= service.getaccount(bankregform);
        Assertions.assertNotNull(openAccount.accountNumber);
        Assertions.assertNotNull(openAccount.bankBranch);
        Assertions.assertNotNull(openAccount.ifscCode);
        Assertions.assertNotNull(openAccount.name);


    }
}
