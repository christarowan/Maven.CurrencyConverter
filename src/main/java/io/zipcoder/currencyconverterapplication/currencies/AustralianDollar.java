package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        // return ConvertableCurrency.super.convert(currencyType);
        Double myRate = CurrencyType.AUSTRALIAN_DOLLAR.getRate();
        Double targetRate = currencyType.getRate();
        return targetRate / myRate;
    }
}
