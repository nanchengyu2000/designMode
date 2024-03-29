package Combination;

public class TextFile extends AbstractFile{
    private String TextFileName;

    public void setTextFileName(String textFileName) {
        TextFileName = textFileName;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        System.out.println("不支持此功能");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        System.out.println("删除成功！");
    }

    @Override
    public AbstractFile getChile(int i) {
        System.out.println("不支持此功能");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("文本文件病毒杀手");
    }
}
