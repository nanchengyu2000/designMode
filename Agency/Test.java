package Agency;

public class Test {
    public static void main(String[] args) {
        YouTube youTube = new YouTube();
        VPN vpn = new VPN();
        vpn.setWeb(youTube);
        vpn.request();
    }
}
