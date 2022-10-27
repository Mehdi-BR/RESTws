import javax.xml.ws.Endpoint;
import ws.BanqueService;


public class ServeurJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:1254/";
        Endpoint.publish(url,new BanqueService());
        System.out.println(url);
    }
}
