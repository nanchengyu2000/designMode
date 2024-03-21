package Builder;

public abstract class ActorBuilder {
    protected Actor actor=new Actor();
    public abstract void buildType();
    public abstract void  buildSex();
    public abstract void  buildFace();
    public abstract void  buildCostume();
    public abstract void  buildHairstyle();
    //钩子方法
    public boolean isBareHeader(){  //更加精细的设计
        return false;
    }
    public Actor createActor(){
        return actor;
    }
}
