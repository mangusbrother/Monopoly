package com.mangusbrother;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class Railroad extends Property {

    public Railroad(String name) {
        super(name, 200, PropertyType.RAILROAD, 100);
    }

    @Override
    public double calculateRent(int dice) {
        Player owner = getOwner();
        if (owner != null && !isMortgaged())
            switch (owner.getGroup(PropertyType.RAILROAD).size()) {
                case 1:
                    return 25;
                case 2:
                    return 50;
                case 3:
                    return 100;
                case 4:
                    return 200;
            }
        return 0;
    }
}
