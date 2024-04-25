package hw8.task2;

public class Tree {
    private String type;
    private int height;
    private int countOfSticks;
    private String color;
    @Override
    public String toString() {
        return "Tree{" +
                "type='" + type + '\'' +
                ", height=" + height +
                ", countOfSticks=" + countOfSticks +
                ", color='" + color + '\'' +
                '}';
    }

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;

    }

    public Tree(int height, int countOfSticks, String color) {
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.color = color;
        this.type = "fir";
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.color = "yellow";
    }

    public Tree(String type) {
        this();
        this.type = type;
    }
}
