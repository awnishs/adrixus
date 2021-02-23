package com.adrixus.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrixus.domain.Card;
import com.adrixus.response.CardResponse;
import com.adrixus.service.CardService;

@RestController
@RequestMapping("/assignment")
public class CardController {

	LinkedHashMap<String, String> mapOfString = new LinkedHashMap<String, String>();

	@Autowired
	CardService cardService;
	
	@PostMapping("/createCard")
	private CardResponse createCard(@RequestBody Card card) {
		mapOfString.clear();
		
		try {
		card = cardService.createCard(card);
		
		mapOfString.put("status", "1");
		mapOfString.put("message", "Successfully Created Card");

		}catch(Exception ex) {
			mapOfString.clear();
			mapOfString.put("status", "0");
			mapOfString.put("message", "failed");
			mapOfString.put("error", ex.getLocalizedMessage());
			return new CardResponse(mapOfString, null);

		}
		return new CardResponse(mapOfString, card);
	}
	
	@PostMapping("/assignCard")
	private CardResponse assignCard(@RequestBody Card card) {
		mapOfString.clear();
		
		try {
		card = cardService.assignCard(card);
		
		mapOfString.put("status", "1");
		mapOfString.put("message", "Successfully Assigned Card to customer");

		}catch(Exception ex) {
			mapOfString.clear();
			mapOfString.put("status", "0");
			mapOfString.put("message", "failed");
			mapOfString.put("error", ex.getLocalizedMessage());
			return new CardResponse(mapOfString, null);

		}
		return new CardResponse(mapOfString, card);
	}

}

