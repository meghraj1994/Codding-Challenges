package functionalprogramming;

public class Pen {

    public String name;

    public Pen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen='" + name + '\'';
    }
}
