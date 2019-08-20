package com.movierental;

class TextStatement {

  private String name;
  private Rentals rentals;

  public TextStatement(String name, Rentals rentals) {
    this.name = name;
    this.rentals = rentals;
  }

  public String statement() {
    String result = "Rental Record for " + name + "\n";
    for (Rental each : rentals) {
      result += "\t" + each.getMovie().getTitle() + "\t" +
          each.amount() + "\n";
    }

    result += "Amount owed is " + rentals.totalAmount() + "\n";
    result += "You earned " + rentals.frequentRenterPoints() + " frequent renter points";
    return result;
  }
}
