package Age;

import com.christinatest.person.Women;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AgeTests {
    @Test
    public void testisRetiredWomenTrue(){
        Women womenAge = new Women("Anna", "Flower",60, "Tom Cook", "TestStreet2");
        Assert.assertFalse(womenAge.isRetiredWomen(), "The age more than 60 or incorrect");
    }
    @Test
    public void testisRetiredWomenFalse(){
        Women womenAge = new Women("Anna", "Flower",89, "Tom Cook", "TestStreet2");
        Assert.assertTrue(womenAge.isRetiredWomen(), "The age less than 60 or incorrect");
    }
}
