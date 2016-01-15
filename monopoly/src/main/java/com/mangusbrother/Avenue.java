package com.mangusbrother;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class Avenue extends Property {

    private double[] rent;
    private int buildings;
    private double buildingCost;
    private int groupSize;

    public Avenue(String name, double price, PropertyType type, double mortgagePrice, int groupSize, double buildingCost, double[] rent) {
        super(name, price, type, mortgagePrice);
        this.groupSize = groupSize;
        this.buildingCost = buildingCost;
        this.rent = rent;
    }

    @Override
    public double calculateRent(int dice) {
        Player owner = getOwner();
        if (owner == null)
            return 0;
        else if (isMortgaged())
            return 0;
        else {
            int size = owner.getGroup(getType()).size();
            if (buildings == 0) {
                if (size == groupSize)
                    return rent[0] * 2;
                else
                    return rent[0];
            } else {
                return rent[buildings];
            }
        }
    }

    public void build() throws InsufficientFundsException {
        if (getOwner().getBalance() < buildingCost)
            throw new InsufficientFundsException(buildingCost - getOwner().getBalance());

        getOwner().decrementBalance(buildingCost);
        buildings++;
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
}
