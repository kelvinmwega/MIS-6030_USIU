package com.company;

/**
 * Class to handle Coffee Bag pricing and taxation
 */
public class CoffeeBag {

    double pricePerPound, taxRate, unitWeight, totalPrice, totalPriceWithTax;
    int numberOfBags;

    public void setUnitWeight(double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    /**
     * CoffeeBag Constructor
     * @param pricePerPound price of coffee bag per pound
     * @param taxRate the taxation rate
     */
    public CoffeeBag(double pricePerPound, double taxRate){
        this.pricePerPound = pricePerPound;
        this.taxRate = taxRate;
    }

    /**
     * Method to calculate total price of a coffee bag
     */
    public void calculateTotalPrice(){
        this.totalPrice = this.unitWeight * this.numberOfBags * this.pricePerPound;
        this.totalPriceWithTax = this.totalPrice + (this.totalPrice * this.taxRate);
    }

    /**
     * Method to create the display message
     * @return the created message string
     */
    public String createDisplayMessage(){
        return String.format("%s%d%s%.0f%s%.2f%s%.2f%s%.2f%s", "<html>Number of bags sold: ", this.numberOfBags,
                "<br>&emsp;&emsp;&ensp;Weight per bag: ", this.unitWeight, "&nbsp;lb<br>&emsp;&emsp;&nbsp;Price per pound: $", this.pricePerPound,
                "<br>&emsp;&emsp;&emsp;&emsp;&emsp;Sales tax: ", this.taxRate*100,
                "%<br><br>&emsp;&emsp;&emsp;&emsp;&ensp;Total price: $ ", this.totalPriceWithTax ," </html");
    }
}
