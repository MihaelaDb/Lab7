package platibancare;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
public class ConversieCurrencyImpl implements ConversieCalcul {
    private static final Map<platibancare.Currency, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put(platibancare.Currency.RON, 0.21);
        exchangeRates.put(platibancare.Currency.USD, 1.18);
        exchangeRates.put(platibancare.Currency.GBP, 0.86);
        exchangeRates.put(platibancare.Currency.TRY, 11.03);
        exchangeRates.put(platibancare.Currency.EUR, 1.0);
    }

    @Override
    public double conversieValutaToEur(double amount, platibancare.Currency currency) {

        double exchangeRate = exchangeRates.get(currency);
        return amount / exchangeRate;

    }

    @Override
    public double calculRata() {
        return 0;
    }
}
