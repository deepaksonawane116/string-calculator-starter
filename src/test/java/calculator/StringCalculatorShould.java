package calculator;

import org.junit.jupiter.api.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

        
        
    	@Test
    	public void testEmptyString() {
    		assertEquals(0, StringCalculator.add(""));
    	}
    	@Test
    	public void testOneNumber() {
    		assertEquals(1, StringCalculator.add("1"));
    	}
    }
    
    
    
    
    
    
    
    
    


