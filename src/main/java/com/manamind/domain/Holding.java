package com.manamind.domain;

import java.math.BigDecimal;

public final class Holding {
    private final String ticker;
    private BigDecimal volume;
    private BigDecimal costPrice;

    public Holding(String ticker) {
        this.ticker = ticker;
    }

    public Holding(String ticker, BigDecimal volume, BigDecimal costPrice) {
        this.ticker = ticker;
        this.volume = volume;
        this.costPrice = costPrice;
    }

    public String getTicker() {
        return ticker;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Holding holding = (Holding) o;

        return ticker.equals(holding.ticker);
    }

    @Override
    public int hashCode() {
        return ticker.hashCode();
    }
}
