package com.adrixus.response;

import java.util.LinkedHashMap;

import com.adrixus.domain.Card;

public class CardResponse {

	private LinkedHashMap<String, String> status = new LinkedHashMap<String, String>();
	private Card card;
	
	public CardResponse() {
	}
	public CardResponse(LinkedHashMap<String, String> status, Card card) {
		super();
		this.status = status;
		this.card = card;
	}
	public LinkedHashMap<String, String> getStatus() {
		return status;
	}
	public void setStatus(LinkedHashMap<String, String> status) {
		this.status = status;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	
}
