package hashMapImpl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SidHashMapTest {
	 
    private SidHashMap sidHashMap;
    private final int NUM_ELEMENTS = 200;
 
    @Before
    public void setUp(){
    	sidHashMap = new SidHashMap(20);
    }
 
    @Test
    public void testHashMapPut(){
    	sidHashMap.put("Test1", "Test1Value");
    }
 
    @Test
    public void testPutGet(){
        String k = "TestPutGet";
        String v = "TestPutGetValue";
        sidHashMap.put(k, v);
        String valueResult = sidHashMap.get(k);
        assertEquals(v, valueResult);
    }
 
    @Test
    public void testHashMapCollisions() {
        /* Initialise hashmap */
        for(int i = 0; i < NUM_ELEMENTS; i++){
        	sidHashMap.put(Integer.toString(i), Integer.toString(i));
        }
        /* Test all values of the get method */
        for(int i = 0; i < NUM_ELEMENTS; i++){
            String value = sidHashMap.get(Integer.toString(i));
            assertEquals(Integer.toString(i), value);
        }
    }
 
    @After
    public void tearDown(){
    	sidHashMap = null;
    }
}