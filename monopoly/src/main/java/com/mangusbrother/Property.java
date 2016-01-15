package com.mangusbrother;

import lombok.Data;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */
@Data
public abstract class Property implements Step {
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

    public void mortgage() {
        if (mortgaged)
            throw new IllegalStateException("Property Already Mortgaged");

        mortgaged = true;
        owner.incrementBalance(mortgagePrice);
    }

    public void buyBack() throws InsufficientFundsException {
        if (!mortgaged)
            throw new IllegalStateException("Property Not Mortgaged");

        if (owner.getBalance() < mortgagePrice)
            throw new InsufficientFundsException(mortgagePrice - owner.getBalance());

        mortgaged = false;
        owner.decrementBalance(mortgagePrice);
    }

    public void buy(Player p) throws InsufficientFundsException {
        p.buy(this);
        owner = p;
    }

    public void auction(Player winner, double price) throws InsufficientFundsException {
        winner.buyAuction(this, price);
        owner.sellAuction(this, price);
        owner = winner;
    }

    public enum PropertyType {
        UTILITY, RAILROAD, BROWN, BLUE, PINK, ORANGE, RED, YELLOW, GREEN, PURPLE
    }
}

