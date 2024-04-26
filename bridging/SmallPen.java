package bridging;

public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        String penType="Ð¡ºÅµÄÃ«±Ê";
        color.bePaint(penType,name);
    }
}
