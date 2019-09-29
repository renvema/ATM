package factory;

import dao.ClientDao;
import dao.impl.ClientDaoImpl;

public class ClientDaoFactory {

    private static ClientDao instance;

    private ClientDaoFactory(ClientDao instance) {
    }

    public static synchronized ClientDao getInstance(){
        if (instance == null){
            instance = new ClientDaoImpl();
        }
        return instance;
    }
}
