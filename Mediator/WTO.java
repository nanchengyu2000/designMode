package Mediator;

import java.util.Hashtable;

public class WTO extends UN{
    private Hashtable countries=new Hashtable();
    @Override
    protected void register(Country country) {
        if (!countries.contains(country)) countries.put(country.getName(),country);
        country.setUn(this);
    }

    @Override
    protected void sendMessage(String from, String to, String message) {
        Country to_country = (Country) countries.get(to);
        if (to_country!=null){
            System.out.println(from+"发送消息给"+to+":"+message);
            to_country.receiveNegotiate(from, message);
        }else {
            System.out.println("用户不在组织中！");
        }
    }
}
