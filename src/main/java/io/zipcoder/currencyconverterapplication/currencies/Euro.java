package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        // return ConvertableCurrency.super.convert(currencyType);
        Double myRate = CurrencyType.EURO.getRate();
        Double targetRate = currencyType.getRate();
        return targetRate / myRate;
    }
}
