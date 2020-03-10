package com.company;

/**
 * Class to handle donut area calculation
 */
public class Area {

    Double radius1, radius2;

    public Double getRadius1() {
        return radius1;
    }

    public void setRadius1(Double radius1) {
        this.radius1 = radius1;
    }

    public Double getRadius2() {
        return radius2;
    }

    public void setRadius2(Double radius2) {
        this.radius2 = radius2;
    }

    /**
     * Method to calculate area of a donut
     * @return area of donut
     */
    public Double donutAreaCalculator() {

        if (this.radius1 < this.radius2) {
            throw new IllegalArgumentException();
        }

        return calculateArea(this.radius1) - calculateArea(this.radius2);
    }

    /**
     * Method to calculate area of a circle
     * @param radius
     * @return area of circle
     */
    private Double calculateArea(Double radius){
        return Math.PI * radius * radius;
    }

}
