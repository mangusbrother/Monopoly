package com.mangusbrother;

import lombok.Data;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */
@Data
public abstract class Property implements Step {
    private final String name;
    private final double price;
    private final PropertyType type;
    private final double mortgagePrice;
    private Player owner;
    private boolean mortgaged;

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

    @Override
    public boolean action(Player player, int dice) throws InsufficientFundsException {

        if (getOwner() == null)
            return true;
        double rent = calculateRent(dice);

        player.payRent(rent);
        getOwner().incrementBalance(rent);

        return false;
    }

    public enum PropertyType {
        UTILITY, RAILROAD, BROWN, BLUE, PINK, ORANGE, RED, YELLOW, GREEN, PURPLE
    }
}

