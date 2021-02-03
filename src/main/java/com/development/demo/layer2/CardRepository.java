package com.development.demo.layer2;

import com.development.demo.layer1.*;

public interface CardRepository {
    String addCard(Card card);
    Card getCard(String userName);
    String updateCard(Card card);
	
}