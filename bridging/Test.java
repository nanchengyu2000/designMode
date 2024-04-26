package bridging;

public class Test {
    public static void main(String[] args) {
        SmallPen smallPen = new SmallPen();
        Red red = new Red();
        smallPen.setColor(red);
        smallPen.draw("œ ª®");
    }
}
