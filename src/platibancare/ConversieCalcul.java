package platibancare;

import java.util.Currency;

public interface ConversieCalcul {

    double calculRata();

    double conversieValutaToEur(double amount, platibancare.Currency currency);
}
