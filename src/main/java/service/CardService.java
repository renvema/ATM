package service;

import model.Card;
import model.Client;

public interface CardService {

    Client getClientByCard(Card card);
}
