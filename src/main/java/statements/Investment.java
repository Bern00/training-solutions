package statements;

public class Investment {
    double cost;
    int fund;
    int interestRate;
    boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
        this.cost = 0.3;
    }

    public int getFund() {
        return fund;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public double getYield(int days) {
        return fund * interestRate * days / ( 365 *100 );
    }

    public double close(int days) {
        double totalAmount = (getFund() + getYield(days)) * (1 - cost / 100);
        double payout = active ? totalAmount : 0;
        active = false;
        return payout;
    }
}
