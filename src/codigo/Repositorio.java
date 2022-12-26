package codigo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Repositorio implements Serializable {

    private static Repositorio repo = null;

    public Repositorio (){};


    private Map<String, Cliente> client = new HashMap<String, Cliente>();
    private Map<String, Admin> admins = new HashMap<String, Admin>();
    private Map<Integer, Reserva> reservas = new HashMap<Integer, Reserva>();
    private Map<String, Carro> carros = new HashMap<String, Carro>();



    public Map<String, Cliente> getClients() {
        return client;
    }
    public Map<String, Admin> getAdmins() {return admins;}
    public Map<Integer, Reserva> getReservas() { return reservas;}
    public Map<String, Carro> getCarros() { return carros;}

    public static Repositorio getRepository(){

        ReentrantLock lock = new ReentrantLock();

        lock.lock();
        if (repo == null)
            repo = new Repositorio();
        lock.unlock();

        return repo;
    }



    public void serialize(String filename){

        try{
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + filename + "\n");
        } catch(IOException ex){
            System.out.println("ErrorSerialize: " + ex.getMessage());
        }
    }

    public static void deserialize(String filename){

        try{
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            repo = (Repositorio) in.readObject();
            in.close();
            fileIn.close();
        } catch(IOException ex){
            System.out.println("ErrorDeserialize: " + ex.getMessage());
        } catch(ClassNotFoundException ex){
            System.out.println("Repository class not found. " + ex.getMessage());
        }
    }

}
