package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private Rentals rentals = new Rentals();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    String result = "Rental Record for " + getName() + "\n";
    for (Rental each : rentals) {
      result += "\t" + each.getMovie().getTitle() + "\t" +
              String.valueOf(each.amount()) + "\n";
    }

    result += "Amount owed is " + String.valueOf(rentals.totalAmount()) + "\n";
    result += "You earned " + String.valueOf(rentals.frequentRenterPoints())
            + " frequent renter points";
    return result;
  }

  public String htmlStatement() {
    String result = "<h3>Rental Record for " + getName() + "</h3>";
    result += "<p>";
    for (Rental each : rentals) {
      result += each.getMovie().getTitle() + ": <b>" +
              each.amount() + "</b><br>";
    }
    result += "</p>";

    result += "<p>Amount owed is <b>" + rentals.totalAmount() + "</b></p>";
    result += "<p>You earned <b>" + rentals.frequentRenterPoints()
            + "</b> frequent renter points</p>";
    return result;
  }
}

