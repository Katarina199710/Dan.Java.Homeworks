package hw8.task1;

import java.util.Objects;

public class Computer {
    private String brand;
    private int price;
    private int ramCapacity;
    private int videoCardCapacity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramCapacity == computer.ramCapacity && videoCardCapacity == computer.videoCardCapacity && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ramCapacity, videoCardCapacity);
    }

    @Override
    public String toString() {
        return "Created PC.\n" + "Name = " + brand + ".\n" + "Price = " + price + ".\n" + "Video card = "
                + videoCardCapacity + ".\n" + "RAM = " + ramCapacity + ".";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getVideoCardCapacity() {
        return videoCardCapacity;
    }

    public void setVideoCardCapacity(int videoCardCapacity) {
        this.videoCardCapacity = videoCardCapacity;
    }
}
