package bridging;

public class MiddlePen extends Pen{
    @Override
    public void draw(String name) {
        String penType="ÖÐºÅµÄÃ«±Ê";
        color.bePaint(penType,name);
    }
}
