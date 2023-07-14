package Entities;

public class Rectangulo {
    private int width;
    private int height;
    private String color;
    private boolean active;

    public Rectangulo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Getters and Setters

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
