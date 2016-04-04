package se.nackademin;

public class Translator {
    private String [10] adjektiv;
    private String [10] substantiv;
    private String [10] verb;
    
    public String DoTranslate(int i, String t) {
    	if (t == "A")
    		return adjektiv[i];
    	else if(t == "B")
    			return verb[i];
    	else if (t == "C")
    		return substantiv[i];
    	else if (t == "D")
    		return verb[index];
    	else if (t == "E")
    		return adjektiv[i];
    }

}
