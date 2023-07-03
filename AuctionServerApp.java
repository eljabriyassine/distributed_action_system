import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AuctionServerApp {
    public static void main(String[] args) {
        try {
            AuctionServer server = new AuctionServerImpl();

            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/AuctionServer", server);

            server.runAuction();

            // To end the auction, call server.endAuction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
