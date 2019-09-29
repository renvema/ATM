package factory;

import service.ClientService;
import service.impl.ClientServiceImpl;

public class ClientServiceFactory {

    private static ClientService instance;

    private ClientServiceFactory(){
    }

    public static synchronized ClientService getInstance(){
        if (instance == null){
            instance = new ClientServiceImpl();
        }
        return instance;
    }
}
