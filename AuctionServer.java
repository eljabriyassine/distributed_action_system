import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuctionServer extends Remote {
    void registerClient(AuctionClient client) throws RemoteException;
    void unregisterClient(AuctionClient client) throws RemoteException;
    void placeBid(AuctionClient client, double amount) throws RemoteException;
}
