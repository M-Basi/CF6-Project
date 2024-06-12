package gr.aueb.cf.ch15.bankApp;

import gr.aueb.cf.ch15.bankApp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.bankApp.exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.bankApp.exceptions.SsnNotValidException;

import java.time.LocalDateTime;

public class OverDraftAccount extends Account{

    public OverDraftAccount(){

    }

    public OverDraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws
            SsnNotValidException, NegativeAmountException {
        try {
            if (amount < 0 ) {
                throw new NegativeAmountException(amount);
            }
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            setBalance(getBalance() - amount);
            //Logging
            System.out.println("Success in withdraw. Amount: " + amount + ", SSN: " + ssn + ", " + LocalDateTime.now());
        }catch (SsnNotValidException | NegativeAmountException e) {
            //Logging
            System.err.println("Error: " + e.getMessage() + ", " + LocalDateTime.now());
            throw e;
        }
    }


}
