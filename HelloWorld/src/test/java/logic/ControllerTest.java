package test.java.logic;


import static org.junit.Assert.assertEquals;

import main.java.logic.Controller;

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
