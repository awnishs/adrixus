package com.adrixus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrixus.domain.Card;
import com.adrixus.repository.CardRepository;
import com.adrixus.service.CardService;

@Service
public class CardServiceImpl implements CardService{

	@Autowired
	CardRepository cardRepository;

	@Override
	public Card createCard(Card card) {

		card = cardRepository.save(card);
		
		return card;
	}

	@Override
	public Card assignCard(Card card) {
	
		card = cardRepository.save(card);
		
		return card;
	}
	
	
}
