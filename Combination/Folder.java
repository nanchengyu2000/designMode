package Combination;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    private String name;

    private List<AbstractFile> lists=new ArrayList<>();

    @Override
    public void add(AbstractFile abstractFile) {
        lists.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        lists.remove(abstractFile);
    }

    @Override
    public AbstractFile getChile(int i) {
        return lists.get(i);
    }

    @Override
    public void killVirus() {
        for (AbstractFile list : lists) {
            list.killVirus();
        }
    }
}
