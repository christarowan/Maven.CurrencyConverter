package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        // return ConvertableCurrency.super.convert(currencyType);
        Double myRate = CurrencyType.RINGGIT.getRate();
        Double targetRate = currencyType.getRate();
        return targetRate / myRate;
    }
}
