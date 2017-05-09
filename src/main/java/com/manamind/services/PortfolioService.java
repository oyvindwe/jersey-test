package com.manamind.services;


import java.math.BigDecimal;

import com.manamind.domain.Portfolio;

public class PortfolioService {

    public Portfolio getPortfolio(String id) {
        Portfolio portfolio = new Portfolio(id);

        // Add some dummy data
        portfolio.setHolding("STL", new BigDecimal("100"), new BigDecimal("1500"));
        portfolio.setHolding("NHY", new BigDecimal("200"), new BigDecimal("1750"));
        portfolio.setHolding("DNB", new BigDecimal("150"), new BigDecimal("1100"));

        return portfolio;
    }

}
