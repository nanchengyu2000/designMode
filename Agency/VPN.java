package Agency;

public class VPN implements Web{
    private Web web;

    public Web getWeb() {
        return web;
    }

    public void setWeb(Web web) {
        this.web = web;
    }

    @Override
    public void request() {
        web.request();
    }
}
