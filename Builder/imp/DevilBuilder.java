package Builder.imp;

import Builder.ActorBuilder;

public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("凶恶");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("光上半身");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    @Override
    public boolean isBareHeader() {
        return true;
    }
}
