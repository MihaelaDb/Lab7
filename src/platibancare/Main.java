package platibancare;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User("Dobromirescu", "Mihaela", "RO123456");

        List<Tranzactie> tranzactii = new ArrayList<>();

        Payment payment1 = new Payment(100.0, platibancare.Currency.EUR, user, "Product 1");
        Payment payment2 = new Payment(200.0, platibancare.Currency.USD, user, "Product 2");
        Payment payment3 = new Payment(150.0, platibancare.Currency.GBP, user, "Product 3");

        Tranzactie transaction1 = new Tranzactie(1, payment1);
        Tranzactie transaction2 = new Tranzactie(2, payment2);
        Tranzactie transaction3 = new Tranzactie(3, payment3);

        tranzactii.add(transaction1);
        tranzactii.add(transaction2);
        tranzactii.add(transaction3);

        System.out.println("Lista țărilor/zonelor pentru care s-au făcut plăți:");
        for (Tranzactie tranzactie : tranzactii) {
            System.out.println(tranzactie.getPayment().getCurrency().getCountry());
        }

        Tranzactie storno = transaction2.stornare();
        Tranzactie storno2 = transaction3.stornare();

        System.out.println("\nDetalii tranzacție inițială:");
        transaction2.printTransactionDetails();
        System.out.println("\nDetalii tranzacție stornată:");
        storno.printTransactionDetails();

        System.out.println("\nTranzacții făcute de utilizatorul " + user.getPrenume() + " " + user.getNume() + ":");
        for (Tranzactie tranzactie : tranzactii) {
            if (tranzactie.getPayment().getUser().equals(user)) {
                System.out.println("Amount: " + tranzactie.getPayment().getAmount() + ", Currency: " + tranzactie.getPayment().getCurrency());
            }
        }
    }
}
