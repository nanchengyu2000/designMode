package bridging;

public abstract class Pen {
    public Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(String name);
}
