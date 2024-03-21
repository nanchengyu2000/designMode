package Builder.imp;

import Builder.ActorBuilder;

public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("Ó¢ÐÛ");
    }

    @Override
    public void buildSex() {
        actor.setSex("ÄÐ");
    }

    @Override
    public void buildFace() {
        actor.setFace("Ë§");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("¿ø¼×");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("³¤·¢");
    }
}
