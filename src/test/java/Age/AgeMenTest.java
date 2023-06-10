package Age;

import com.christinatest.person.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeMenTest {
        @Test
        public void testisRetiredManTrue(){
            Man manAge = new Man("Bob", "Smith", 40, "Mary Bom", "TestStreet1");
            Assert.assertFalse(manAge.isRetiredMan(), "The age more than 65 or incorrect");
        }
        @Test
        public void testisRetiredMenFalse(){
            Man manAge = new Man("Bob", "Smith", 66, "Mary Bom", "TestStreet1");
            Assert.assertTrue(manAge.isRetiredMan(), "The age less than 65 or incorrect");
        }
}
