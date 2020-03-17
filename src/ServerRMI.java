
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ServerRMI  {


    public static void main(String[] args) {
        try{
            CalculateurImpl c = new CalculateurImpl();
            ICalculateur stub = (ICalculateur) UnicastRemoteObject.exportObject(c,1099);

           Registry lg = LocateRegistry.createRegistry(1099);

            lg.rebind("calc",c);


            //Naming.rebind("calc",c);

            System.out.println("Hello there");






        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
