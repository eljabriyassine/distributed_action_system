import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class AuctionServerImpl extends UnicastRemoteObject implements AuctionServer {
    private List<AuctionClient> clients;
    private double highestBid;
    private AuctionClient highestBidder;

    public AuctionServerImpl() throws RemoteException {
        clients = new ArrayList<>();
        highestBid = 0.0;
    }

    @Override
    public void registerClient(AuctionClient client) throws RemoteException {
        clients.add(client);
    }

    @Override
    public void unregisterClient(AuctionClient client) throws RemoteException {
        clients.remove(client);
    }

    @Override
    public void placeBid(AuctionClient client, double amount) throws RemoteException {
        if (amount > highestBid) {
            if (highestBidder != null) {
                highestBidder.notify("You have been outbid.");
            }
            highestBid = amount;
            highestBidder = client;
            client.notify("You are currently the highest bidder with a bid of " + highestBid);
        } else {
            client.notify("Your bid of " + amount + " is not higher than the current highest bid of " + highestBid);
        }
    }

    public void runAuction() throws RemoteException {
        for (AuctionClient client : clients) {
            client.notify("The auction has started.");
        }
    }

    public void endAuction() throws RemoteException {
        for (AuctionClient client : clients) {
            if (client == highestBidder) {
                client.notifyWinner("Congratulations! You won the auction with a bid of " + highestBid);
            } else {
                client.notify("The auction has ended. The winner is " + highestBidder + " with a bid of " + highestBid);
            }
        }
    }
}
