package endtalk;

public class Player {
	 	String name; 
	    String word; 
	 
	    public Player() {
	    	
	    }
	    
	    
	    public Player(String name) {
	        this.name = name;
	    }
	    
	    public void sayWord(String word) {
	        this.word = word;
	    }
	    public Boolean succeed(String lastWord) {
	        int lastIndex = lastWord.length() - 1;
	        char lastChar = lastWord.charAt(lastIndex);
	        char firstChar = word.charAt(0);
	        if(firstChar == lastChar)
	            return true;
	        else
	            return false;
	    }
}
