package com.company;

/**
 * Class to cal
 */
public class CoffeeBag {

    Double pricePerPound = 5.99;
    Double taxRate = 7.25;
    Double unitWeight;
    int numberOfBags;
    Double totalPrice, totalPriceWithTax;

    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    /**
     * Method to calculate total price of a coffee bag
     */
    public void calculateTotalPrice(){
        this.totalPrice = this.unitWeight * this.numberOfBags * pricePerPound;
        this.totalPriceWithTax = this.totalPrice + (this.totalPrice * taxRate);
        this.displayResult();
    }

    /**
     * Method to display the results
     */
    private void displayResult(){
        System.out.println(this.totalPriceWithTax);
    }
}
