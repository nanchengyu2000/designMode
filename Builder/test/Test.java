package Builder.test;

import Builder.Actor;
import Builder.ActorDirector;
import Builder.Util.ReadXml;
import Builder.imp.AngelBuilder;
import Builder.imp.DevilBuilder;

public class Test {
    public static void main(String[] args) {
        ReadXml.setXMLPath("Resourse/config.xml");
        DevilBuilder bean = ReadXml.getBean(DevilBuilder.class);
        Actor actor = ActorDirector.construct(bean);
        System.out.println(actor.toString());
    }
}
