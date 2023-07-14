package Entities;

public class DiscountCalculator {
    private int discount;
    private double regularPrice;
    private double discountPrice;

    public DiscountCalculator(int discount, double regularPrice) {
        this.discount = discount;
        this.regularPrice = regularPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
