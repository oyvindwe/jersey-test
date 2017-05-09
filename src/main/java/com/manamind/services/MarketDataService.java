package com.manamind.services;


import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class MarketDataService {

    BigDecimal getLast(String ticker) {
        return BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(5, 35)).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}
