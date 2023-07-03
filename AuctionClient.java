import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuctionClient extends Remote {
    void notify(String message) throws RemoteException;
    void notifyWinner(String message) throws RemoteException;
}
