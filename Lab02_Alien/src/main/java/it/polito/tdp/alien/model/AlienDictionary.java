package it.polito.tdp.alien.model;

import java.util.HashMap;
import java.util.Map;

public class AlienDictionary {
	
	private Map<String,WordEnhanced> dictionary;

	public AlienDictionary() {
		super();
		this.dictionary = new HashMap<>();
	}
	public void addWord(String alienWord,String translate) {
		if (dictionary.containsKey(alienWord)) {
			if(dictionary.get(alienWord).getTranslation().size()>1) {
				
				return;
			}
			else {
			dictionary.get(alienWord).addTranslation(translate);
			return;
			}
		}
			
		
		else {
			dictionary.put(alienWord,new WordEnhanced(alienWord,translate));
			return;
  	}
	}
	public String translateWord(String alienWord) {
		String  result= null;
		if(dictionary.containsKey(alienWord)) {
			result = dictionary.get(alienWord).getTranslation()+"\n";
		}
		return result;
		
	}
	public Map<String, WordEnhanced> getDictionary() {
		return dictionary;
	}
	

}
