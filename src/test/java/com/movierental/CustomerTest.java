package com.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldPrintStatement(){
        Customer customer = new Customer("Shashi");
        customer.addRental(new Rental(new Movie("Gladiator", 0), 4));
        customer.addRental(new Rental(new Movie("Avengers", 1), 4));
        customer.addRental(new Rental(new Movie("Toy Story", 2), 4));

        String statement = customer.statement();
        assertEquals("Rental Record for Shashi\n" +
                "\tGladiator\t5.0\n" +
                "\tAvengers\t12.0\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 20.0\n" +
                "You earned 4 frequent renter points", statement);
    }
}
