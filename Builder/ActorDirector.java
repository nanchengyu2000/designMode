package Builder;

public class ActorDirector {
    public static Actor construct(ActorBuilder ab){
        ab.buildType();
        ab.buildSex();
        ab.buildCostume();
        ab.buildFace();
        if (!ab.isBareHeader())
            ab.buildHairstyle();
        return ab.createActor();
    }
}
