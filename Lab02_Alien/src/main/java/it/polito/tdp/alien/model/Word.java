package it.polito.tdp.alien.model;

public class Word {
	private String alienword;
	private String translation;
	public Word(String alienword, String translation) {
		super();
		this.alienword = alienword;
		this.translation = translation;
	}
	public void setAlienword(String alienword) {
		this.alienword = alienword;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	public String getAlienword() {
		return alienword;
	}
	public String getTranslation() {
		return translation;
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
		Word other = (Word) obj;
		if (alienword == null) {
			if (other.alienword != null)
				return false;
		} else if (!alienword.equals(other.alienword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "alienword=" + alienword + ", translation=" + translation + "\n";
	}
	
	

}
