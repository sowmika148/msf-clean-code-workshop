package com.movierental;

public class Movie {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String title;
  private PriceCode priceCode;

  public Movie(String title, int priceCode) {
    this.title = title;
    setPriceCode(priceCode);
  }

  public int getPriceCode() {
    return priceCode.getPriceCode();
  }

  public void setPriceCode(int arg) {
    switch (arg) {
      case Movie.REGULAR: this.priceCode = new RegularPrice();
        break;
      case Movie.NEW_RELEASE: this.priceCode = new NewReleasePrice();
        break;
      case Movie.CHILDRENS: this.priceCode = new ChildrenPrice();
        break;
    }
  }


  public String getTitle() {
    return title;
  }

}
