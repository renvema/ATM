package dao;

import model.Card;
import model.Client;

public interface CardDao {

    Client getClientByCard(Card card);
}
