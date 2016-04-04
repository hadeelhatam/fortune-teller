package se.nackademin;

public class Translator {
    private String [] adjektiv = {"stor", "liten", "stark", "svag", "mjuk", "hård", "snabb", "vacker", "ljus", "mörk"};
    private String [] substantiv = {"en lönehöjning", "en lönesänkning", "en fotboja", "en katt", "en hund", "ett hus", "ett barn", "ett elstängsel", "en dator", "ett golv"};
    private String [] verb = {"springa", "ljuga", "flyga", "se", "vara", "äta", "mäta", "gå", "röra", "resa"};
    
    public String DoTranslate(int index, String type) {
    	if (type == "A")
    		return adjektiv[index];
    	else if(type == "B")
    			return verb[index];
    	else if (type == "C")
    		return substantiv[index];
    	else if (type == "D")
    		return verb[index];
    	else 
    		return adjektiv[index];
    }

}
