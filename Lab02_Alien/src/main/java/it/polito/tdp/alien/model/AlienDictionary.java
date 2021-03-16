package it.polito.tdp.alien.model;

import java.util.HashMap;
import java.util.Map;

public class AlienDictionary {
	
	private Map<String,Word> dictionary;

	public AlienDictionary() {
		super();
		this.dictionary = new HashMap<>();
	}
	public void addWord(String alienWord,String translate) {
//		if (dictionary.containsKey(alienWord)) {
//			return;
//		}
//		else {
			dictionary.put(alienWord,new Word(alienWord,translate));
			return;
//		}
	}
	public String translateWord(String alienWord) {
		String  result= null;
		if(dictionary.containsKey(alienWord)) {
			result = dictionary.get(alienWord).getTranslation();
		}
		return result;
		
	}

}
