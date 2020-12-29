package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {
    public int counter(List<Transaction> transactions, int max) {

        int count = 0;
        for (Transaction tr: transactions) {
            if(tr.getBalance() < max) {
                count++;
            }
        }
        return count;
    }
}
