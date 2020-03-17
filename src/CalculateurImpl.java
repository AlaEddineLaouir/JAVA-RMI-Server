import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculateurImpl   implements ICalculateur {

    public CalculateurImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        return a-b;
    }
}
