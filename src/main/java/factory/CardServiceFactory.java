package factory;

import service.CardService;
import service.impl.CardServiceImpl;

public class CardServiceFactory {

    private static CardService instance;

    private CardServiceFactory() {
    }

    public static synchronized CardService getInstance(){
        if (instance == null){
            instance = new CardServiceImpl();
        }
        return instance;
    }
}
