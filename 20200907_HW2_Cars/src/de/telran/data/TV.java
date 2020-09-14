package de.telran.data;

public class TV {
    private String brand;
    private String model;
    private int yearOfIssue;
    private String manufacturСountry;
    private double diagonal;
    private boolean SmartTv;
    private String color;
    private double price;

    public TV() {};

    public TV(String brand, String model, double diagonal) {
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
    }

    public TV(String brand, String model, int yearOfIssue, String manufacturСountry, double diagonal, boolean smartTv, String color) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.manufacturСountry = manufacturСountry;
        this.diagonal = diagonal;
        SmartTv = smartTv;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getManufacturСountry() {
        return manufacturСountry;
    }

    public void setManufacturСountry(String manufacturСountry) {
        this.manufacturСountry = manufacturСountry;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public boolean isSmartTv() {
        return SmartTv;
    }

    public void setSmartTv(boolean smartTv) {
        SmartTv = smartTv;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TV  " + brand +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", manufacturСountry='" + manufacturСountry + '\'' +
                ", diagonal=" + diagonal +
                ", SmartTv=" + SmartTv +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public void tvVoltage(){
        System.out.println("220 Volt");

    }
}
