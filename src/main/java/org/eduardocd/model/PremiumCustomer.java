package org.eduardocd.model;

import lombok.AllArgsConstructor;

public class PremiumCustomer extends Customer implements Comparable<PremiumCustomer> {

    public PremiumCustomer(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public int compareTo(PremiumCustomer o) {
        return 0;
    }
}
