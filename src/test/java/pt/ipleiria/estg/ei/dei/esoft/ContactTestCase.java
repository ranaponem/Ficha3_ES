package pt.ipleiria.estg.ei.dei.esoft;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ContactTestCase {
    @Test
    public void testCreateContact() {
        var contact = new Contact("foo", "bar", "912 345 678");
        assertEquals("foo", contact.getFirstName());
        assertEquals("bar", contact.getLastName());
        assertEquals("912 345 678", contact.getPhone());
    }
    /*
    @Test
    public void testFooBar() {
        fail("I fail with this message"); // Try this!
    }*/
}
