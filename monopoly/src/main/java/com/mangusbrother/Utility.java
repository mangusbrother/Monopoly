package com.mangusbrother;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Utility extends Property {

    public Utility(String name) {
        super(name, 150, PropertyType.UTILITY, 75);
    }

    @Override
    public double calculateRent(int dice) {
        Player owner = getOwner();
        if (owner == null || isMortgaged())
            return 0;
        else {
            if (owner.getGroup(PropertyType.UTILITY).size() == 1)
                return 4 * dice;
            else
                return 10 * dice;
        }
    }
}
