package com.development.demo.layer2;

import org.springframework.stereotype.Repository;

import com.development.demo.layer1.Card;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
@Repository
public class CardRepositoryImplementation implements CardRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    public String addCard(Card card) {
        entityManager.persist(card);
        return "success";
    }

   

    @Transactional
    public String updateCard(Card card) {
        entityManager.merge(card);
        return "success";
    }

	@Override
	public Card getCard(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
}
