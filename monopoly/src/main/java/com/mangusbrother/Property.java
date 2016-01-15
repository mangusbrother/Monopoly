package com.mangusbrother;

import lombok.Data;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */
@Data
public abstract class Property {
    private Player owner;

    private String name;
    private double price;
    private PropertyType type;
    private boolean mortgaged;
    private double mortgagePrice;

    public Property(String name, double price, PropertyType type, double mortgagePrice) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.mortgagePrice = mortgagePrice;

        owner = null;
        mortgaged = false;

    }

    public abstract double calculateRent(int dice);

    public double mortgage() {
        if (mortgaged)
            throw new IllegalStateException("Property Already Mortgaged");

        mortgaged = true;
        owner.incrementBalance(mortgagePrice);

        return owner.getBalance();
    }

    public double buyBack() throws InsufficientFundsException {
        if (!mortgaged)
            throw new IllegalStateException("Property Not Mortgaged");

        if (owner.getBalance() < mortgagePrice)
            throw new InsufficientFundsException(mortgagePrice - owner.getBalance());

        mortgaged = false;
        owner.decrementBalance(mortgagePrice);

        return owner.getBalance();
    }

    public enum PropertyType {
        UTILITY, RAILROAD, BROWN, BLUE, PINK, ORANGE, RED, YELLOW, GREEN, PURPLE
    }
}

