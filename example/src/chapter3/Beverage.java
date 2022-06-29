package chapter3;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI,}
    Size size = Size.TALL;
    String description = "제목 없음";

    public String getDescription() {
        return description + " " + getSize();
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return this.size;
    }
}
