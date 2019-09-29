package factory;

import dao.CardDao;
import dao.impl.CardDaoImpl;

public class CardDaoFactory {

    private static CardDao instance;

    private CardDaoFactory() {
    }

    public static synchronized CardDao getInstance(){
        if (instance == null){
            instance = new CardDaoImpl();
        }
        return instance;
    }
}
