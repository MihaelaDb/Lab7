package platibancare;

public class Payment {
    private final double amount;
    private Currency currency;
    private final User user;
    private final String purpose;


    public Payment(double amount, platibancare.Currency currency, User user, String purpose) {
        this.amount=amount;
        this.purpose=purpose;
        this.user=user;
        this.currency=currency;

    }

    public double getAmount(){
        return amount;
    }
    public platibancare.Currency getCurrency(){
        return currency;
    }
    public String getPurpose(){
        return purpose;
    }

    public User getUser(){
        return user;
    }



}

