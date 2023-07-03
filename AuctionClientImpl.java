import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class AuctionClientImpl extends UnicastRemoteObject implements AuctionClient {
    private String name;
    private AuctionServer server;

    public AuctionClientImpl(String name, AuctionServer server) throws RemoteException {
        this.name = name;
        this.server = server;
        server.registerClient(this);
    }

    @Override
    public void notify(String message) throws RemoteException {
        System.out.println("[Notification] " + message);
    }

    @Override
    public void notifyWinner(String message) throws RemoteException {
        System.out.println("[Winner] " + message);
    }

    public static void main(String[] args) {
        try {
            AuctionServer server = (AuctionServer) Naming.lookup("rmi://localhost/AuctionServer");
            AuctionClientImpl client = new AuctionClientImpl("Client1", server);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your bid amount: ");
            double bidAmount = scanner.nextDouble();

            server.placeBid(client, bidAmount);

            // To end the auction, call server.endAuction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
