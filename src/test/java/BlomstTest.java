import Model.Blomst;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlomstTest {
    Blomst blomst;

    @Before
    public void setUp() throws Exception {
        blomst = new Blomst("Rose");
    }

    @Test
    public void getName() {
        String exp = "Rose";
        String act = blomst.getName();
        assertEquals(exp,act);
    }
}