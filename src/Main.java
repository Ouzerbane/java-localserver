
import utils.AppConfig;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Server is starting...");
        AppConfig cfg = ConfigLoader.loadFromFile("/home/oyoussef/Desktop/java-localserver/config.json");
        Server server = new Server();
        System.out.println(cfg.servers.size());
        System.out.println(cfg.servers.get(0).ports.get(0));

    }
}
