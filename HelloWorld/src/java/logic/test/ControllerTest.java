package java.logic.test;


import static org.junit.Assert.assertEquals;

import java.logic.main.Controller;

import org.junit.Test;

public class ControllerTest {
    Controller controller = new Controller();

    @Test
    public void testAdd() {
        int expected = 5;
        int actual = controller.add(2,3);
        assertEquals(actual, expected);
    }
}
