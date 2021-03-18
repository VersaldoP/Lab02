package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class FXMLController {
	private AlienDictionary model;
	private String[] divide;
	private String[] stronzo;
	private String word;
	private String translation;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    public void setModel(AlienDictionary model) {
		// TODO Auto-generated method stub
		this.model=model;
	}

    @FXML
    void doReset(ActionEvent event) {
    	txtWord.setText("");
    	txtResult.setText("");
    	model.getDictionary().clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	word = txtWord.getText();
    	word =word.toLowerCase();
    	boolean spazio=word.contains(" ");
    	boolean lettere=word.matches("[a-z]+");
    	boolean question=word.contains("?");

    	if (spazio) {
    		
    		divide = word.split(" ");
    		
    		if(divide.length==2) {
    			
    			word = divide[0];
        		translation = divide[1];
        		
        		if(word.matches("[a-z]+")&&translation.matches("[a-z]+")) {
        			
            		model.addWord(word,translation);
            		txtWord.setText("");
            		txtResult.setText("Traduzione inserita correttamente");

            		return;
        			
        		}
        		else {
        			txtWord.setText("");
        			txtResult.setText("Errore, Devi inserire solo Parole nel formato: Parola Traduzione");
        		}
    		}
    		else {
    			txtWord.setText("");
    			txtResult.setText("Errore, Devi inserire solo Parole nel formato: Parola Traduzione");
    		}
    		
    	}
    	else {
    		if(question) {
    			/*
    			
//    			word.replaceAll("?","1");
//    			System.out.println(word);
//    			
//    		
//    		stronzo = word.split("1");
//    		String word1 = stronzo[0];
//    		
//		    translation = stronzo[1];
//		    System.out.println(word1+" "+translation);
//    	
//		
//		if(divide.length==2) {
//			
		
//		if(word1.matches("[a-z]+")&&translation.matches("[a-z]+")) {
 * */
    		
    			if(word.matches("[a-z]+")||word.contains("?")){

    			for(String s :model.getDictionary().keySet()) {
    				if(s.length()==word.length()) {
    					int control= 0;
    				 
    					for(int i =0;i<s.length();i++) {
                            
    						if(word.charAt(i)==s.charAt(i)||word.charAt(i)=='?') {
    							
    							control++;
    							
    							
    						}
    					}
    					if(control==word.length()) {
    						txtResult.setText(model.getDictionary().get(s).toString());
    	    	    		txtWord.setText("");

    	    	    		return;
    						
    					}
    				}
    			}
			}
		
		
		else {
			txtWord.setText("");
			txtResult.setText("Errore, Devi inserire solo Parole nel formato: Parola Traduzione");
			}
    			
    		
    		}
    		else 
    			
    		{
    			if(lettere) 
    			{
    			
    		
    			if(model.getDictionary().containsKey(word))
    			{
    			
    	    		txtResult.setText(model.getDictionary().get(word).toString());
    	    		txtWord.setText("");

    	    		return;
    	    	}
    			else {
        			txtResult.setText("Errore, la parola "+word+" non è presente nel Dizionario");
        			txtWord.setText("");
        			return;
    				}
    			
    			}
    			else {
    				txtWord.setText("");
    				txtResult.setText("Errore, Devi inserire solo Parole nel formato: Parola Traduzione");
    				}
    			}
    	
    		
    	}
    }
    
    
    
    
    
    	
    	
    	
//    	if(spazio=word.contains(" ")&& lettere) {
//    		
//    		divide = word.split(" ");
//    		word = divide[0];
//    		translation = divide[1];
//    		model.addWord(word,translation);
//    		txtWord.setText("");
//    		txtResult.setText("Traduzione inserita correttamente");
//    		System.out.println("Check Var");
//    		return;
//    		
//    		
//    	}
//    	else {
////    		if(word.matches("[a-z]+")) {
//    		if(model.getDictionary().containsKey(word)) {
//    		
//    		txtResult.setText(model.getDictionary().get(word).toString());
//    		txtWord.setText("");
//    		System.out.println("Check Var");
//    		return;
////    		}
//    		}
//    		else {
//    			txtResult.setText("Errore, la parola inserita non è presente nel Dizionario");
//    			return;
//    		}
//    		}
//    	
//    	
//    
//    	
////    		txtWord.setText("");
//    		txtResult.setText("Errore, Devi inserire solo Parole nel formato: Parola Traduzione");
//    		System.out.println(lettere);
//        	System.out.println(spazio);
//    		
//    		
//    	
//    }

    

    @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	
}
