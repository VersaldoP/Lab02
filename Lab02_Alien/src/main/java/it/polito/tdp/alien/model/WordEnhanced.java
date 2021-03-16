package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class WordEnhanced {
	private String alienword;
	private List<String> translation;
	public WordEnhanced(String alienword, String translation) {
		super();
		this.alienword = alienword;
		this.translation = new ArrayList<>();
		this.translation.add(translation);
	}
	public void setAlienword(String alienword) {
		this.alienword = alienword;
	}
	
	
	public String getAlienword() {
		return alienword;
	}
	public List<String> getTranslation() {
		return translation;
	}
	public void addTranslation(String t2) {
		translation.add(t2);
		return;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienword == null) ? 0 : alienword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordEnhanced other = (WordEnhanced) obj;
		if (alienword == null) {
			if (other.alienword != null)
				return false;
		} else if (!alienword.equals(other.alienword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Alienword<" + alienword + ">, Translation<" + translation + ">\n";
	}
	
	

}
