package platibancare;

public class Tranzactie extends ConversieCurrencyImpl implements Cloneable {
    private final int id;
    private final Payment payment;
    private String refNmb;
    private Currency currency;
    private double amount;


    public Tranzactie(int id, Payment payment) {
        super();
        this.id = id;
        this.payment = payment;
        this.refNmb = null;
        this.currency = Currency.EUR;
        this.amount = ConversieValutaToEur(payment.getAmount(), payment.getCurrency());
    }

    private double ConversieValutaToEur(double amount, Currency currency) {
        this.amount=amount;
        this.currency=currency;
        return amount;
    }
    public Tranzactie stornare() {
        Tranzactie storno = null;
        try {
            storno = (Tranzactie) this.clone();
            storno.amount *= -1;
            storno.refNmb = String.valueOf(this.id);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return storno;
    }

    public double getAmount() {
        return amount;
    }

    public Payment getPayment() {
        return payment;
    }


    public void printTransactionDetails() {
        System.out.println("Tranzactie initiala:");
        System.out.println("ID: " + id);
        System.out.println("Amount: " + amount + " " + currency.getSymbol());
        System.out.println("Referinta: " + refNmb);
        System.out.println("User: " + payment.getUser().getNume() + " " + payment.getUser().getPrenume());
        System.out.println("Purpose: " + payment.getPurpose());
        System.out.println();
    }
}

