package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int accountCounter(List<BankAccount> bankAccounts, int min) {
        int count = 0;
        for(BankAccount bc: bankAccounts) {
            if(bc.getBalance() > min) {
                count ++;
            }
        }
        return count;
    }
}
