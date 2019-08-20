package com.movierental;

class HTMLStatement {

  private String name;
  private Rentals rentals;

  public HTMLStatement(String name, Rentals rentals) {
    this.name = name;
    this.rentals = rentals;
  }

  public String statement() {
    String result = "<h3>Rental Record for " + name + "</h3>";
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
