package com.manamind.domain;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Portfolio {

    private final String id;
    private final Set<Holding> holdings = new HashSet<>();

    public Portfolio(String id) {
        this.id = id;
    }

    public Set<Holding> getHoldings() {
        return Collections.unmodifiableSet(holdings);
    }

    public Portfolio setHolding(String ticker, BigDecimal volume, BigDecimal costPrice) {
        holdings.add(new Holding(ticker, volume, costPrice));
        return this;
    }

}
